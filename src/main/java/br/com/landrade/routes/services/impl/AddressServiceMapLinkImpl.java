package br.com.landrade.routes.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.xml.ws.soap.SOAPFaultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Point;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;
import br.com.landrade.routes.services.AddressService;
import br.com.maplink2.webservices.AddressFinderSoap;

@Component
public class AddressServiceMapLinkImpl implements AddressService {
	
	private static final Logger log = LoggerFactory.getLogger(AddressServiceMapLinkImpl.class);

	private final AddressFinderSoap addressFinderSoap;

	private final String token;

	@Autowired
	public AddressServiceMapLinkImpl(
			@Qualifier("addressFinderclient") AddressFinderSoap addressFinderSoap,
			@Qualifier("webserviceToken") String token) {
		this.addressFinderSoap = addressFinderSoap;
		this.token = token;
	}

	@Override
	public List<Point> getPoints(Address... addresses) throws AddressNotExistsException {
		List<Point> points = new ArrayList<>();
		List<Future<Point>> futures = new ArrayList<>();
		for (Address address : addresses) {
			futures.add(internalGetPoint(address));
		}

		for (Future<Point> future : futures) {
			Point point = null;
			try {
				point = future.get();
			} catch (Exception e) {
				log.error("Ocorreu um erro na rotina assincrona de carregar Point", e);
			}
			
			if (point == null)
				throw new AddressNotExistsException();
			
			points.add(point);
				
		}

		return points;
	}

	@Async
	private Future<Point> internalGetPoint(Address address) {
		// Transforma os objetos de dominio em objetos do WebService
		br.com.maplink2.webservices.Address maplinkAddress = new br.com.maplink2.webservices.Address();
		br.com.maplink2.webservices.City maplinkCity = new br.com.maplink2.webservices.City();
		maplinkCity.setName(address.getCity());
		maplinkCity.setState(address.getState());
		maplinkAddress.setCity(maplinkCity);
		maplinkAddress.setStreet(address.getStreet());
		maplinkAddress.setHouseNumber(address.getHouseNumber());

		br.com.maplink2.webservices.Point maplinkPoint = null;
		try {
			maplinkPoint = addressFinderSoap.getXY(maplinkAddress, token);
		} catch (SOAPFaultException e) {
			log.error("Ocorreu um erro na chamanda do webservice de carregar Point", e);
		}
		
		if (maplinkPoint == null) {
			return new AsyncResult<Point>(null);
		}

		Point point = new Point(maplinkPoint.getX(), maplinkPoint.getY());
		return new AsyncResult<Point>(point);
	}

}

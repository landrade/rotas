package br.com.landrade.routes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Point;
import br.com.landrade.routes.domain.Route;
import br.com.landrade.routes.domain.Route.RouteType;
import br.com.landrade.routes.domain.RouteDetails;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;
import br.com.landrade.routes.services.AddressService;
import br.com.landrade.routes.services.RouteDetailsService;
import br.com.landrade.routes.services.RouteService;

@Service("routeService")
public class RouteServiceImpl implements RouteService {

	private final AddressService addressService;

	private final RouteDetailsService routeDetailsService;

	@Autowired
	public RouteServiceImpl(AddressService addressService,
			RouteDetailsService routeDetailsService) {
		this.addressService = addressService;
		this.routeDetailsService = routeDetailsService;
	}

	@Override
	public RouteDetails getRouteDetails(RouteType routeType, Address... addresses) throws AddressNotExistsException {
		if (routeType == null) 
			throw new IllegalArgumentException("Route Type cannot be null");
		
		if (addresses == null) 
			throw new IllegalArgumentException("Address cannot be null");
		
		List<Point> points = addressService.getPoints(addresses);
		Route route = new Route(points.toArray(new Point[] {}));
		route.setType(routeType);
		return routeDetailsService.getRouteDetails(route);
	}

}

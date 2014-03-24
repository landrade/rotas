package br.com.landrade.routes.services;

import java.util.List;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Point;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;

public interface AddressService {
	
	List<Point> getPoints(Address... address) throws AddressNotExistsException;

}

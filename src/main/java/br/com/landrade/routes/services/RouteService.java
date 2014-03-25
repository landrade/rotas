package br.com.landrade.routes.services;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Route.RouteType;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;
import br.com.landrade.routes.domain.RouteDetails;

public interface RouteService {
	
	RouteDetails getRouteDetails(RouteType routeType, Address... addresses) throws AddressNotExistsException;

}

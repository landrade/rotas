package br.com.landrade.routes.services;

import br.com.landrade.routes.domain.Route;
import br.com.landrade.routes.domain.RouteDetails;

public interface RouteDetailsService {
	
	RouteDetails getRouteDetails(Route route);

}

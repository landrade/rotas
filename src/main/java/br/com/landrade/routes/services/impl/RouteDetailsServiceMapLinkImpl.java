package br.com.landrade.routes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.landrade.routes.domain.Point;
import br.com.landrade.routes.domain.Route;
import br.com.landrade.routes.domain.RouteDetails;
import br.com.landrade.routes.services.RouteDetailsService;
import br.com.maplink2.webservices.ArrayOfRouteStop;
import br.com.maplink2.webservices.RouteOptions;
import br.com.maplink2.webservices.RouteSoap;
import br.com.maplink2.webservices.RouteStop;
import br.com.maplink2.webservices.RouteTotals;
import br.com.maplink2.webservices.Vehicle;

@Component
public class RouteDetailsServiceMapLinkImpl implements RouteDetailsService {

	private final RouteSoap service;

	private final String token;

	@Autowired
	public RouteDetailsServiceMapLinkImpl(
			@Qualifier("routeClient") RouteSoap service,
			@Qualifier("webserviceToken") String token) {
		this.service = service;
		this.token = token;
	}

	@Override
	public RouteDetails getRouteDetails(Route route) {
		ArrayOfRouteStop rs = new ArrayOfRouteStop();
		for (Point stop : route.getStops()) {
			RouteStop maplinkRouteStop = new RouteStop();
			br.com.maplink2.webservices.Point maplinkPoint = new br.com.maplink2.webservices.Point();
			maplinkPoint.setX(stop.getX());
			maplinkPoint.setY(stop.getY());
			maplinkRouteStop.setPoint(maplinkPoint);
			rs.getRouteStop().add(maplinkRouteStop);
		}
		RouteTotals maplinkRouteTotals = service.getRouteTotals(rs,
				getRouteOptions(route.getType().getCode()), token);
		return new RouteDetails(maplinkRouteTotals.getTotalTime(),
				maplinkRouteTotals.getTotalDistance(),
				maplinkRouteTotals.getTotalfuelCost(),
				maplinkRouteTotals.getTotalCost());
	}

	private RouteOptions getRouteOptions(int routeType) {
		br.com.maplink2.webservices.RouteDetails routeDetails = new br.com.maplink2.webservices.RouteDetails();
		routeDetails.setDescriptionType(0);
		routeDetails.setRouteType(routeType);
		routeDetails.setOptimizeRoute(true);

		Vehicle vehicle = new Vehicle();
		vehicle.setTankCapacity(20);
		vehicle.setAverageConsumption(9);
		vehicle.setFuelPrice(3);
		vehicle.setAverageSpeed(60);
		vehicle.setTollFeeCat(2);

		RouteOptions routeOptions = new RouteOptions();
		routeOptions.setLanguage("portugues");
		routeOptions.setRouteDetails(routeDetails);
		routeOptions.setVehicle(vehicle);

		return routeOptions;
	}

}

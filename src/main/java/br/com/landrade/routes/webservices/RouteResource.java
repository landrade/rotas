package br.com.landrade.routes.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webservices.routes.landrade.com.br/")
public interface RouteResource {

	@WebMethod
	RouteDetailsDTO getRouteDetails(
			@WebParam(name = "routeType") int routeType,
			@WebParam(name = "addresses") AddressDTO[] address);
}

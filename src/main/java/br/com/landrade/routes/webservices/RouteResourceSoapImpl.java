package br.com.landrade.routes.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Route.RouteType;
import br.com.landrade.routes.domain.RouteDetails;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;
import br.com.landrade.routes.services.RouteService;

@WebService(endpointInterface = "br.com.landrade.routes.webservices.RouteResource", targetNamespace = "http://webservices.routes.landrade.com.br/")
public class RouteResourceSoapImpl implements RouteResource {

	private RouteService routeService;

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	@Override
	public RouteDetailsDTO getRouteDetails(int routeType, AddressDTO[] address) {
		RouteType enumRouteType = RouteType.toEnum(routeType);
		if (enumRouteType == null)
			throw new IllegalArgumentException("Not exists Route Type");

		try {
			List<Address> addresses = new ArrayList<>();
			for (AddressDTO addressDTO : address) {
				addresses.add(new Address(addressDTO.getStreet(), addressDTO
						.getHouseNumber(), addressDTO.getCity(), addressDTO
						.getState()));
			}
			RouteDetails details = routeService.getRouteDetails(enumRouteType,
					addresses.toArray(new Address[] {}));
			RouteDetailsDTO dto = new RouteDetailsDTO();
			dto.setDistance(details.getDistance());
			dto.setFuelCost(details.getFuelCost());
			dto.setTime(details.getTime());
			dto.setTotalCost(details.getTotalCost());
			return dto;
		} catch (AddressNotExistsException e) {
			throw new IllegalArgumentException("Not exists Address");
		}
	}

}

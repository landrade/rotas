package br.com.landrade.routes.webservices.maplink.services;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.AddressFinderSoap;
import br.com.maplink2.webservices.City;
import br.com.maplink2.webservices.Point;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class AddressFinderTest {
	
	@Autowired
	@Qualifier("webserviceToken")
	String token;
	
	@Autowired
	@Qualifier("addressFinderclient")
	private AddressFinderSoap service;
	
	@Test
	public void deveEstarPreenchidoPeloContainer() {
		Assert.assertNotNull(service);
	}
	
	@Test
	public void deveRetornarUmPointComSucesso() {
		Address address = new Address();
		address.setStreet("Avenida Alfredo Baltazar da Silveira");
		address.setHouseNumber("1");
		City city = new City();
		city.setName("Rio de Janeiro");
		city.setState("RJ");
		address.setCity(city);
		Point expected = new Point();
		expected.setX(-43.4375259);
		expected.setY(-23.0070981);
		Assert.assertEquals(expected, service.getXY(address, token));
	}

}

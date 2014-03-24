package br.com.landrade.routes.services.impl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.landrade.routes.domain.Address;
import br.com.landrade.routes.domain.Point;
import br.com.landrade.routes.domain.exceptions.AddressNotExistsException;
import br.com.landrade.routes.services.AddressService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class AddressServiceMapLinkImplTest {
	
	@Autowired
	private AddressService service;
	
	@Test
	public void deveReceberDoContainer() {
		Assert.assertNotNull(service);
	}
	
	@Test
	public void deveReceberUmaListaDePoints() throws Exception {
		Address address1 = new Address("Avenida Alfredo Baltazar da Silveira", "419", "Rio de Janeiro", "RJ");
		Address address2 = new Address("Avenida Rio Branco", "23", "Rio de Janeiro", "RJ");
		List<Point> points = service.getPoints(address1, address2);
		Assert.assertEquals(points.get(0).getX(), -43.4400121);
		Assert.assertEquals(points.get(0).getY(), -23.0089848);
		Assert.assertEquals(points.get(1).getX(), -43.1806801);
		Assert.assertEquals(points.get(1).getY(), -22.8972873);
	}
	
	@Test(expected = AddressNotExistsException.class)
	public void deveDispararExcecao_QuandoNaoExistirEndereco() throws Exception {
		Address address1 = new Address("asdcas", "4139", "abc", "re");
		Assert.assertEquals(0, service.getPoints(address1).size());
	}

}

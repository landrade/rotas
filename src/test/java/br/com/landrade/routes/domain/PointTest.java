package br.com.landrade.routes.domain;

import junit.framework.Assert;

import org.junit.Test;

public class PointTest {
	
	@Test
	public void deveCriarUmPointComSucesso() {
		Double x = 123d;
		Double y = 321d;
		Point point = new Point(x, y);
		Assert.assertEquals(point .getX(), x);
		Assert.assertEquals(point.getY(), y);
	}
	
	@Test(expected = NullPointerException.class)
	public void deveRetornarErro_QuandoTentarCriarComXNulo() {
		new Point(null, 123d);
	}
	
	@Test(expected = NullPointerException.class)
	public void deveRetornarErro_QuandoTentarCriarComYNulo() {
		new Point(312d, null);
	}
	
	@Test
	public void deveRetornarTrue_QuandoObjetosIguais() {
		Point pointA = new Point(123d, 321d);
		Point pointB = new Point(123d, 321d);
		Assert.assertTrue(pointA.equals(pointB));
	}
	
	@Test
	public void deveRetornarFalse_QuandoObjetosDiferentes() {
		Point pointA = new Point(321d, 123d);
		Point pointB = new Point(123d, 321d);
		Assert.assertFalse(pointA.equals(pointB));
	}

}

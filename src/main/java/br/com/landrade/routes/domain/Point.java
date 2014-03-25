package br.com.landrade.routes.domain;

import java.util.Objects;

public class Point {
	
	/* Properties */
	
	private final Double x;
	
	private final Double y;
	
	private final Address address;

	/* Constructors */
	
	/**
	 * Construtor Padrão
	 * @param x
	 * @param y
	 */
	public Point(Double x, Double y, Address address) {
		this.x = Objects.requireNonNull(x, "X cannot be null");
		this.y = Objects.requireNonNull(y, "Y cannot be null");
		this.address = Objects.requireNonNull(address, "Address cannot be null");
	}

	/* Getters */
	
	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}
	
	public Address getAddress() {
		return address;
	}
	
	/* Equals and Hascode */

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Point) {
			Point other = (Point) obj;
			return Objects.equals(x, other.x) && Objects.equals(y, other.y); 
		}
		return false;
	}

}

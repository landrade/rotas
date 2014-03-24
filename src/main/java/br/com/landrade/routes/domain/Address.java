package br.com.landrade.routes.domain;

import java.util.Objects;

public class Address {

	/* Properties */

	private final String street;

	private final String houseNumber;

	private final String city;

	private final String state;

	/* Constructors */

	/**
	 * Construtor Padrão
	 * 
	 * @param street
	 * @param houseNumber
	 * @param city
	 * @param state
	 */
	public Address(String street, String houseNumber, String city, String state) {
		this.street = Objects.requireNonNull(street, "Street cannot be null");
		this.houseNumber = Objects.requireNonNull(houseNumber, "HouseNumber cannot be null");
		this.city = Objects.requireNonNull(city, "City cannot be null");
		this.state = Objects.requireNonNull(state, "State cannot be null");
	}

	/* Getters */

	public String getStreet() {
		return street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	/* Equals and Hascode */

	@Override
	public int hashCode() {
		return Objects.hash(street, houseNumber, city, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Address) {
			Address other = (Address) obj;
			return Objects.equals(street, other.street)
					&& Objects.equals(houseNumber, other.houseNumber)
					&& Objects.equals(city, other.city)
					&& Objects.equals(state, other.state);
		}
		return false;
	}

}

package br.com.landrade.routes.domain;

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
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
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
	
	
	
	
	

}

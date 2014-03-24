package br.com.landrade.routes.domain.exceptions;

public class AddressNotExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AddressNotExistsException(String message) {
        super(message);
    }
	
	public AddressNotExistsException() {
		super();
	}
	
	

}

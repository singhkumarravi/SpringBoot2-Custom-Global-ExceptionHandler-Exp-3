package com.olive.custom.exception;

public class ProductNotExitException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProductNotExitException() {
		super();
	}

	public ProductNotExitException(String mess) {
		super(mess);
	}
}

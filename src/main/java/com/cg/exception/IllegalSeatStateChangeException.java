package com.cg.exception;

public class IllegalSeatStateChangeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public IllegalSeatStateChangeException() {
		// TODO Auto-generated constructor stub
		
	}
	public IllegalSeatStateChangeException(String s)
	{
		message=s;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
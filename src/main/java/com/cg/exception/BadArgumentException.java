package com.cg.exception;
public class BadArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public BadArgumentException() {
		// TODO Auto-generated constructor stub
		
	}
	public BadArgumentException(String s)
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
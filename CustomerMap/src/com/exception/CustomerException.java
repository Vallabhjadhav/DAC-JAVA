package com.exception;

public class CustomerException extends Exception //custom Exception
{
	
	private static final long serialVersionUID = -5117106058553744031L;

	public CustomerException(String message)
	{
		super(message);
	}
}

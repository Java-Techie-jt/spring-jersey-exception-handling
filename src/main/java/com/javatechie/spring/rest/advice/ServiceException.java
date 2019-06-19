package com.javatechie.spring.rest.advice;

import lombok.Data;

@Data
public class ServiceException extends Exception{

	private int statusCode;

	public ServiceException(String message,int statusCode) {
		super(message);
		this.statusCode=statusCode;
	}
	
	

}

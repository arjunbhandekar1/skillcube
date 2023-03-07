package com.skillcube.driver.exception;

public class DriverNotFoundException extends Exception{

	String resourceName;
	String fieldName;
	long fieldValue;

	public DriverNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}

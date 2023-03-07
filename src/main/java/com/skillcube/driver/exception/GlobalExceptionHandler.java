package com.skillcube.driver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DriverNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundException(DriverNotFoundException ex) {

		String msg = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(msg, false);

		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);

	}
}

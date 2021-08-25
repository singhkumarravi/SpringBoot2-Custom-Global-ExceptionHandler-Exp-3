package com.olive.exception.handle;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.olive.custom.exception.ProductNotExitException;
import com.olive.model.exception.ErrorType;

@RestControllerAdvice
public class MyExceptionHandle {
	
	@ExceptionHandler(ProductNotExitException.class)
	public ResponseEntity<ErrorType> handleExcep(ProductNotExitException excep){
		
		return new ResponseEntity<ErrorType>(new ErrorType(
				excep.getMessage(), 
				"PROD NOT FOUND WITH GIVEN ID", 
				"PROD NOT FOUND", 
				"PRODUCT"),
				HttpStatus.BAD_REQUEST);
	}

}

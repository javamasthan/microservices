package com.exception.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NumberNotFoundException.class)
	public ResponseEntity<?> handleNumberException(NumberNotFoundException ex){
		ErrorMessage msg=new ErrorMessage();
		msg.setErrMsg(ex.getMessage());
		msg.setStatusCode(HttpStatus.NOT_FOUND.toString());
		return new ResponseEntity(msg, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(StringNotEmptyException.class)
	public ResponseEntity<?> handleStringException(StringNotEmptyException ex){
		ErrorMessage msg=new ErrorMessage();
		msg.setErrMsg(ex.getMessage());
		msg.setStatusCode(HttpStatus.BAD_REQUEST.toString());
		return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
	}
	
	
	

}

package com.exception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exception.globalexception.NumberNotFoundException;
import com.exception.globalexception.StringNotEmptyException;

@RestController
public class ExceptionControllerDemo {
	
	/*@GetMapping("/exception/{id}")
	public ResponseEntity<?> testException(@PathVariable("id") int id){
		if(id<10){
			throw new NumberNotFoundException("Number is not Found");
		}
		
		return ResponseEntity.ok().body("Success");
		
	}*/
	

	@GetMapping("/exception/{msg}")
	public ResponseEntity<?> testMsgException(@PathVariable("msg") String msg){
		String msg1="";
		if(msg!=null && msg.length()>5){
			throw new StringNotEmptyException("Msg is exceeds ");
		}else{
			msg1="done";
		}
		
		
		return ResponseEntity.ok().body(msg1);
		
	}

}

package com.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eurekaclient-two")
public class Microservice2 {
	

	@GetMapping("/microtwo-test")
	public String print(@RequestParam("msg") String msg){
		return "this is from microservice two"+msg;
	}
	
	@GetMapping("/getUser")
	public String getUser(){
	return "This is test from microservice two";	
		
	}
	

}

package com.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("eurekaclient-one")
public class Microservice1 {
	
	@Autowired
	private RestTemplate  restTemplate;
	
	@GetMapping("/microone-test")
	public String print(@RequestParam("msg") String msg){
		
	String microsericeResponse=	restTemplate.getForObject("http://microservice-two/eurekaclient-two/microtwo-test?msg="+msg, String.class);
		
		return "this is from microservice one and called second one"+microsericeResponse;
	}
	
	@GetMapping("/test")
	public String test(){
	return "This is test from microservice 1";	
		
	}
	

}

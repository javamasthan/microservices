package com.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/microOneServiceFallback")
	public String userServiceFallback(){
		return "Micro one Service is down as of now try after some time!!!";
	}
	
	@GetMapping("/microTwoServiceFallback")
	public String contactServiceFallback(){
		return "Microservice two Service is down as of now try after some time!!!";
	}

}

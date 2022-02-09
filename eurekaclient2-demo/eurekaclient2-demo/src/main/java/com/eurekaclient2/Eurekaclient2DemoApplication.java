package com.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclient2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient2DemoApplication.class, args);
	}
	
	

}

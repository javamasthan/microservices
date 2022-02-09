package com.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.order.respository.Order;
import com.order.respository.Payment;
import com.order.service.OrderService;


@RestController
public class OrderController {
	
	Logger log=LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	RestTemplate restemPlate;
	
	@PostMapping("/save")
	public String saveOrder(@RequestBody() Order order){
		log.info("Controller ::::");
	    order=orderService.saveOrder(order);
	    Payment p=new Payment();
	    p.setOrderId(order.getId().intValue());
	    p.setAmount("1000");
	    p.setPaymentType("Phonepay");
	    p.setStatus("Paid");
	    p= restemPlate.postForObject("http://localhost:5000/save", p, Payment.class);
	    return "saved successfully order id "+order.getId()+" Paymeny Id :"+p.getId();
	    
	    
	}

}

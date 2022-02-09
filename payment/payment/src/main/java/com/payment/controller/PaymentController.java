package com.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.payment.repository.Payment;
import com.payment.service.PaymentService;

@RestController
public class PaymentController {
	
	Logger log=LoggerFactory.getLogger(PaymentController.class);
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping(value="/save")
	public Payment savePayment(@RequestBody() Payment payment){
		log.info("This is in PaymentController");
		return paymentService.savePayment(payment);
	}

}

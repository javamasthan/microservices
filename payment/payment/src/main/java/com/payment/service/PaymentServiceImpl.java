package com.payment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.repository.Payment;
import com.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	Logger log=LoggerFactory.getLogger(PaymentServiceImpl.class);
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment savePayment(Payment payment) {
		log.info("This is PaymentServiceImpl::");
		return paymentRepository.save(payment);
	}

}

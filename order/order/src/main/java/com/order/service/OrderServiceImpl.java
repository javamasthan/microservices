package com.order.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.respository.Order;
import com.order.respository.OrderRepository;


@Repository
public class OrderServiceImpl implements OrderService {
	Logger log=LoggerFactory.getLogger(OrderServiceImpl.class);
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		log.info("OrderServiceImpl :::");
		return orderRepository.save(order);
	}

}

package com.newt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newt.model.Order;
import com.newt.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public Order addOrder(Order order) {
		
		return orderRepo.save(order);
	}

	@Override
	public Order getOrderByFName(String fName) {
		
		return orderRepo.findOne(fName);
	}

	@Override
	public List<Order> getAllOrders() {
		
		return orderRepo.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		
		return orderRepo.save(order);
	}

	@Override
	public void deleteOrder(String fName) {
		orderRepo.delete(fName);		
	}

	@Override
	public List<Order> getOrderBycFname(String cfName) {
		
		return orderRepo.findBycFirstName(cfName);
	}

	

}

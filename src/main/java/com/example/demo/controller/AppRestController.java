package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.repository.OrdersRepository;

@RestController
@RequestMapping("/api")
public class AppRestController {
	
	@Autowired 
	OrdersRepository ordersRepos;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allOrders",method=RequestMethod.GET)
	public List<Orders> allOrders() { 
		
		List<Orders> result = ordersRepos.findAll();

		return result;
	}
}

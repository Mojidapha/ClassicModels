package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customers;
import com.example.demo.entity.Employees;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Productlines;
import com.example.demo.repository.CustomersRepository;
import com.example.demo.repository.EmployeesRepository;
import com.example.demo.repository.OrdersRepository;
import com.example.demo.repository.ProductlinesRepository;

@RestController
@RequestMapping("/api")
public class AppRestController {
	
	@Autowired 
	OrdersRepository ordersRepos;
	
	@Autowired 
	EmployeesRepository employeesRepos;
	
	@Autowired 
	ProductlinesRepository productlinesRepos;
	
	@Autowired 
	CustomersRepository customersRepository;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allOrders",method=RequestMethod.GET)
	public List<Orders> allOrders() { 
		
		List<Orders> result = ordersRepos.findAll();

		return result;
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allEmployees",method=RequestMethod.GET)
	public List<Employees> allEmployees() { 
		
		List<Employees> result = employeesRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allProductlines",method=RequestMethod.GET)
	public List<Productlines> allProductlines() { 
		
		List<Productlines> result = productlinesRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allCustomers",method=RequestMethod.GET)
	public List<Customers> allCustomers() { 
		
		List<Customers> result = customersRepository.findAll();

		return result;
	}
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customers;
import com.example.demo.entity.Employees;
import com.example.demo.entity.Offices;
import com.example.demo.entity.Orderdetails;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Payments;
import com.example.demo.entity.Productlines;
import com.example.demo.entity.Products;
import com.example.demo.repository.CustomersRepository;
import com.example.demo.repository.EmployeesRepository;
import com.example.demo.repository.OfficesRepository;
import com.example.demo.repository.OrderdetailsRepository;
import com.example.demo.repository.OrdersRepository;
import com.example.demo.repository.PaymentsRepository;
import com.example.demo.repository.ProductlinesRepository;
import com.example.demo.repository.ProductsRepository;

@RestController
@RequestMapping("/api")
public class AppRestController {
	
	@Autowired 
	CustomersRepository customersRepos;
	
	@Autowired 
	EmployeesRepository employeesRepos;
	
	@Autowired 
	OfficesRepository officesRepos;
	
	@Autowired 
	OrderdetailsRepository orderdetailsRepos;
	
	@Autowired 
	OrdersRepository ordersRepos;
	
	@Autowired 
	PaymentsRepository paymentsRepos;
	
	@Autowired 
	ProductlinesRepository productlinesRepos;
	
	@Autowired 
	ProductsRepository productsRepos;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allCustomers",method=RequestMethod.GET)
	public List<Customers> allCustomers() { 
		
		Pageable limit = PageRequest.of(0,10);
		Page<Customers> result = customersRepos.findAll(limit);
		return result.getContent();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allEmployees",method=RequestMethod.GET)
	public List<Employees> allEmployees() { 
		
		List<Employees> result = employeesRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allOffices",method=RequestMethod.GET)
	public List<Offices> allOffices() { 
		
		List<Offices> result = officesRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allOrderdetails",method=RequestMethod.GET)
	public List<Orderdetails> allOrderdetails() { 
		
		List<Orderdetails> result = orderdetailsRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allOrders",method=RequestMethod.GET)
	public List<Orders> allOrders() { 
		
		List<Orders> result = ordersRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allPayments",method=RequestMethod.GET)
	public List<Payments> allPayments() { 
		
		List<Payments> result = paymentsRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allProductlines",method=RequestMethod.GET)
	public List<Productlines> allProductlines() { 
		
		List<Productlines> result = productlinesRepos.findAll();

		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/allProducts",method=RequestMethod.GET)
	public List<Products> allProducts() { 
		
		List<Products> result = productsRepos.findAll();

		return result;
	}
	
	
}

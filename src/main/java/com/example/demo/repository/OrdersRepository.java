package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{ 
	
	//List<Orders> findByCustomerNumber(Integer customerNumber);
}
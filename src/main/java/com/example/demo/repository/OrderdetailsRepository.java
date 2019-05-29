package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderDetailsId;
import com.example.demo.entity.Orderdetails;

@Repository
public interface OrderdetailsRepository extends PagingAndSortingRepository<Orderdetails, OrderDetailsId>{
	List<Orderdetails> findAll(); 
}

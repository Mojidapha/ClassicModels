package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderDetailsId;
import com.example.demo.entity.Orderdetails;

@Repository
public interface OrderdetailsRepository extends JpaRepository<Orderdetails, OrderDetailsId>{

}

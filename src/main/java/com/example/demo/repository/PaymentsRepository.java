package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Payments;

@Repository
public interface PaymentsRepository extends PagingAndSortingRepository<Payments, Long>{
	List<Payments> findAll(); 
}

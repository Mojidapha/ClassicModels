package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customers;

@Repository
public interface CustomersRepository extends PagingAndSortingRepository<Customers , Long>{
	Page<Customers> findAll(Pageable pageable); 
}

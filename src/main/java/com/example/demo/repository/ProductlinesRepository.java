package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Productlines;

@Repository
public interface ProductlinesRepository extends PagingAndSortingRepository<Productlines , String> {
	List<Productlines> findAll(); 

}

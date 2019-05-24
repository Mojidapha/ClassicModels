package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Productlines;

@Repository
public interface ProductlinesRepository extends JpaRepository<Productlines , String> {
	

}

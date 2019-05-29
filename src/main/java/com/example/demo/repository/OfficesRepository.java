package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Offices;

public interface OfficesRepository extends PagingAndSortingRepository<Offices, String>{
	List<Offices> findAll(); 
}

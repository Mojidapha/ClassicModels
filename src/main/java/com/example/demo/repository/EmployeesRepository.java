package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employees;

@Repository
public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Long>{
	List<Employees> findAll();
}

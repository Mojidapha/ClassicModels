package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Products;

@Repository
public interface ProductsRepository  extends PagingAndSortingRepository<Products , String>{
	List<Products> findAll();
}

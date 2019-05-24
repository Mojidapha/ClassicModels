package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Offices;

public interface OfficesRepository extends JpaRepository<Offices, String>{

}

package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

@Repository
public interface OrdersRepository extends PagingAndSortingRepository<Orders, Long> {  //เพื่อช่วยในการแสดงว่าจะให้ในหน้าจอจะแสดงตารางข้อมูลกี่อัน เช่น แสดง 10 อันเมื่อคลิ๊ก ถัดไป อีกหน้าก็จะขึ้นข้อมูลใหม่ 10 อัน
	List<Orders> findAll(); 

}


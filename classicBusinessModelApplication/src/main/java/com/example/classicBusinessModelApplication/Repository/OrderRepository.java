package com.example.classicBusinessModelApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.EntityClasses.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	

}

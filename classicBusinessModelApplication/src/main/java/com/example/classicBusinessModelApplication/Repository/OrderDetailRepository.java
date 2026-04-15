package com.example.classicBusinessModelApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.EntityClasses.OrderDetail;
import com.example.classicBusinessModelApplication.EntityClasses.OrderDetailId;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId>{

}

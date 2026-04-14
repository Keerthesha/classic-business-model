package com.example.classicBusinessModelApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.entityClasses.Payment;
import com.example.classicBusinessModelApplication.entityClasses.PaymentId;

public interface PaymentRepository extends JpaRepository<Payment, PaymentId> {

}

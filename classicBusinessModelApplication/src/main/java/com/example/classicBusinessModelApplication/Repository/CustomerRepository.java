package com.example.classicBusinessModelApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.Entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {}
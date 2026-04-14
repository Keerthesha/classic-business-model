package com.example.classicBusinessModelApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.entityClasses.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}
package com.example.classicBusinessModelApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.classicBusinessModelApplication.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {}
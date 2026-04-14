package com.example.classicBusinessModelApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.DTO.ProductDTO;
import com.example.classicBusinessModelApplication.Entity.Product;
import com.example.classicBusinessModelApplication.Repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Product save(Product p) {
        return repo.save(p);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
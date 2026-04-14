package com.example.classicBusinessModelApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.classicBusinessModelApplication.DTO.ProductDTO;
import com.example.classicBusinessModelApplication.Entity.Product;
import com.example.classicBusinessModelApplication.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product p) {
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
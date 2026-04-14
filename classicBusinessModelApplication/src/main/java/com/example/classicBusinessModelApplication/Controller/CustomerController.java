package com.example.classicBusinessModelApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.classicBusinessModelApplication.DTO.CustomerDTO;
import com.example.classicBusinessModelApplication.Entity.Customer;
import com.example.classicBusinessModelApplication.Service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer c) {
        return service.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
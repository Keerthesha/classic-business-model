package com.example.classicBusinessModelApplication.controllerClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classicBusinessModelApplication.entityClasses.Customer;
import com.example.classicBusinessModelApplication.serviceClasses.CustomerService;

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

package com.example.classicBusinessModelApplication.serviceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.entityClasses.Customer;
import com.example.classicBusinessModelApplication.repository.CustomerRepository;

@Service
public class CustomerService {

	
	    @Autowired
	    private CustomerRepository repo;

	    public List<Customer> getAll() {
	        return repo.findAll();
	    }

	    public Customer getById(int id) {
	        return repo.findById(id).orElse(null);
	    }

	    public Customer save(Customer c) {
	        return repo.save(c);
	    }

	    public void delete(int id) {
	        repo.deleteById(id);
	    }
	}


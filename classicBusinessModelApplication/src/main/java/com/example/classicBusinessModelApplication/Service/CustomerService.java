package com.example.classicBusinessModelApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.DTO.CustomerDTO;
import com.example.classicBusinessModelApplication.Entity.Customer;
import com.example.classicBusinessModelApplication.Repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

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
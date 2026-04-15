package com.example.classicBusinessModelApplication.ServiceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.EntityClasses.Order;
import com.example.classicBusinessModelApplication.Repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public List<Order> getAll() {
        return repo.findAll();
    }

    public Order getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Order save(Order o) {
        return repo.save(o);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}

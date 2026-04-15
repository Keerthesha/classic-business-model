package com.example.classicBusinessModelApplication.ServiceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.EntityClasses.OrderDetail;
import com.example.classicBusinessModelApplication.EntityClasses.OrderDetailId;
import com.example.classicBusinessModelApplication.Repository.OrderDetailRepository;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository repo;

    public List<OrderDetail> getAll() {
        return repo.findAll();
    }

    public OrderDetail save(OrderDetail od) {
        return repo.save(od);
    }

    public void delete(OrderDetailId id) {
        repo.deleteById(id);
    }
}

package com.example.classicBusinessModelApplication.ControllerClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classicBusinessModelApplication.EntityClasses.OrderDetail;
import com.example.classicBusinessModelApplication.EntityClasses.OrderDetailId;
import com.example.classicBusinessModelApplication.ServiceClasses.OrderDetailService;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController {

    @Autowired
    private OrderDetailService service;

    @GetMapping
    public List<OrderDetail> getAll() {
        return service.getAll();
    }

    @PostMapping
    public OrderDetail save(@RequestBody OrderDetail od) {
        return service.save(od);
    }

    @DeleteMapping
    public void delete(@RequestBody OrderDetailId id) {
        service.delete(id);
    }
}

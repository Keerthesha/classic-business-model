package com.example.classicBusinessModelApplication.controllerClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classicBusinessModelApplication.entityClasses.Payment;
import com.example.classicBusinessModelApplication.entityClasses.PaymentId;
import com.example.classicBusinessModelApplication.serviceClasses.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	    @Autowired
	    private PaymentService service;

	    @GetMapping
	    public List<Payment> getAll() {
	        return service.getAll();
	    }

	    @PostMapping
	    public Payment save(@RequestBody Payment p) {
	        return service.save(p);
	    }

	    @DeleteMapping
	    public void delete(@RequestBody PaymentId id) {
	        service.delete(id);
	    }
	}


package com.example.classicBusinessModelApplication.serviceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.classicBusinessModelApplication.entityClasses.Payment;
import com.example.classicBusinessModelApplication.entityClasses.PaymentId;
import com.example.classicBusinessModelApplication.repository.PaymentRepository;

public class PaymentService {

	 @Autowired
	    private PaymentRepository repo;

	    public List<Payment> getAll() {
	        return repo.findAll();
	    }

	    public Payment save(Payment p) {
	        return repo.save(p);
	    }

	    public void delete(PaymentId id) {
	        repo.deleteById(id);
	    }

}

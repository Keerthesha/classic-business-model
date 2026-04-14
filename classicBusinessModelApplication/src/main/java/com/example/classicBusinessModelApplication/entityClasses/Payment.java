package com.example.classicBusinessModelApplication.entityClasses;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
@IdClass(PaymentId.class)
public class Payment {


	    @Id
	    private Integer customerNumber;

	    @Id
	    private String checkNumber;

	    private Date paymentDate;
	    private Double amount;

	    @ManyToOne
	    @JoinColumn(name = "customerNumber", insertable = false, updatable = false)
	    private Customer customer;
	}


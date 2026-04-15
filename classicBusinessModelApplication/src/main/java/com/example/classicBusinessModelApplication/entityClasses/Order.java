package com.example.classicBusinessModelApplication.EntityClasses;
import java.sql.Date;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Integer orderNumber;

    private Date orderDate;
    private Date requiredDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customerNumber")
    //private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}
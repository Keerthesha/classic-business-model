package com.example.classicBusinessModelApplication.EntityClasses;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailId implements Serializable {

    private Integer orderNumber;
    private String productCode;

    // Default constructor (MUST)
    public OrderDetailId() {}

    // Parameterized constructor
    public OrderDetailId(Integer orderNumber, String productCode) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
    }

    // equals() method (MUST)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailId)) return false;
        OrderDetailId that = (OrderDetailId) o;
        return Objects.equals(orderNumber, that.orderNumber) &&
               Objects.equals(productCode, that.productCode);
    }

    // hashCode() method (MUST)
    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productCode);
    }
}

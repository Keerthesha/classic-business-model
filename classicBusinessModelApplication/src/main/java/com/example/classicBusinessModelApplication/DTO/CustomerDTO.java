package com.example.classicBusinessModelApplication.DTO;

public class CustomerDTO {

    private int customerNumber;
    private String customerName;
    private String phone;
    private String city;
    private String country;
    private int salesRepEmployeeNumber;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

    // getters and setters
    
}
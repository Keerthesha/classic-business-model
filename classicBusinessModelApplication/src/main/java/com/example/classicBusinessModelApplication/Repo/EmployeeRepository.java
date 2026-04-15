package com.example.classicBusinessModelApplication.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

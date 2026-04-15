package com.example.classicBusinessModelApplication.Service;	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.Entity.Employee;
import com.example.classicBusinessModelApplication.Repo.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
}

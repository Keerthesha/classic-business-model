package com.example.classicBusinessModelApplication.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classicBusinessModelApplication.Entity.Office;
import com.example.classicBusinessModelApplication.Service.OfficeService;
@RestController
@RequestMapping("/offices")
public class OfficeController {
    @Autowired
    private OfficeService service;
    @GetMapping
    public List<Office> getAllOffices() {
        return service.getAllOffices();
    }
    @GetMapping("/{id}")
    public Office getOfficeById(@PathVariable String id) {
        return service.getOfficeById(id);
    }
    @PostMapping
    public Office addOffice(@RequestBody Office office) {
        return service.saveOffice(office);
    }
    @DeleteMapping("/{id}")
    public String deleteOffice(@PathVariable String id) {
        service.deleteOffice(id);
        return "Office deleted successfully";
    }
}

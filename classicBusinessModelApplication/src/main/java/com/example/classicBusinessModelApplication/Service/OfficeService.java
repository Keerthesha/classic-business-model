package com.example.classicBusinessModelApplication.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classicBusinessModelApplication.Entity.Office;
import com.example.classicBusinessModelApplication.Repo.OfficeRepository;

@Service
public class OfficeService {

    @Autowired
    private OfficeRepository repo;

    public List<Office> getAllOffices() {
        return repo.findAll();
    }

    public Office getOfficeById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Office saveOffice(Office office) {
        return repo.save(office);
    }

    public void deleteOffice(String id) {
        repo.deleteById(id);
    }
}

package com.example.classicBusinessModelApplication.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.classicBusinessModelApplication.Entity.Office;
public interface OfficeRepository extends JpaRepository<Office, String> {
}

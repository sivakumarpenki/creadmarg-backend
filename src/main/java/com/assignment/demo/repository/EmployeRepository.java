package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assignment.demo.model.Employe;


public interface EmployeRepository extends JpaRepository <Employe, String>{
    
}

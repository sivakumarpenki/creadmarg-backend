package com.assignment.demo.service;

import com.assignment.demo.model.Employe;
import com.assignment.demo.model.Vendor;
import com.assignment.demo.repository.EmployeRepository;
import com.assignment.demo.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private EmployeRepository employeeRepository;

    @Autowired
    private VendorRepository vendorRepository;

    public Employe saveEmployee(Employe employee) {
        return employeeRepository.save(employee);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public List<Employe> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}

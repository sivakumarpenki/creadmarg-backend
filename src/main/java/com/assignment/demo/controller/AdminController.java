package com.assignment.demo.controller;

import com.assignment.demo.model.Employe;
import com.assignment.demo.model.Vendor;
import com.assignment.demo.service.AdminService;
import com.assignment.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/employe")
    public Employe createEmployee(@RequestBody Employe employee) {
        return adminService.saveEmployee(employee);
    }

    @PostMapping("/vendor")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return adminService.saveVendor(vendor);
    }

    @GetMapping("/employees")
    public List<Employe> getAllEmployees() {
        return adminService.getAllEmployees();
    }

    @GetMapping("/vendors")
    public List<Vendor> getAllVendors() {
        return adminService.getAllVendors();
    }

    @PostMapping("/sendEmails")
    public ResponseEntity<List<String>> sendEmails(@RequestBody List<Vendor> vendors) {
        List<String> messages = emailService.sendEmails(vendors);
        return ResponseEntity.ok(messages);
    }
}

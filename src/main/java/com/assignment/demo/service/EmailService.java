package com.assignment.demo.service;

import com.assignment.demo.model.Vendor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {
    public List<String> sendEmails(List<Vendor> vendors) {
        List<String> messages = new ArrayList<>();
        for (Vendor vendor : vendors) {
            String message = String.format("Sending payments to vendor %s at UPI %s", vendor.getName(), vendor.getUpi());
            sendEmail(vendor.getEmail(), "Payment Notification", message);
            System.out.println(message); 
            messages.add(message);
        }
        return messages;
    }

    private void sendEmail(String to, String subject, String body) {
        System.out.println("Email sent to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}

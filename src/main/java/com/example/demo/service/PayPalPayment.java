package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay() {
        return "Payment with PayPal";
    }
}

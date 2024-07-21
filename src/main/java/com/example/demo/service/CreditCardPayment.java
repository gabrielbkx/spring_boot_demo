package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay() {
        return "Payment with Credit Card";
    }
}

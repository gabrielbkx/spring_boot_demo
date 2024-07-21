package com.example.demo.facade;

import com.example.demo.service.SingletonService;
import com.example.demo.service.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentFacade {

    private final SingletonService singletonService;
    private final PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentFacade(SingletonService singletonService, @Qualifier("creditCardPayment") PaymentStrategy paymentStrategy) {
        this.singletonService = singletonService;
        this.paymentStrategy = paymentStrategy;
    }

    public String processPayment() {
        String singletonMessage = singletonService.getMessage();
        String paymentMessage = paymentStrategy.pay();
        return singletonMessage + " | " + paymentMessage;
    }
}

package com.learnspringboot.demo;

import org.springframework.stereotype.Service;

public interface PaymentService {
    void processPayment(double amount);
}

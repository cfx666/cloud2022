package com.cui.springcloud.service;

import com.cui.springcloud.entities.Payment;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}

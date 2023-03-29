package com.cui.springcloud.service.impl;

import com.cui.springcloud.dao.PaymentMapper;
import com.cui.springcloud.entities.Payment;
import com.cui.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {

        return paymentMapper.insert(payment);

    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.selectById(id);
    }
}

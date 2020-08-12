package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Payment;
import com.lambdaschool.javavorders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentsServicesImpl implements PaymentsServices
{
    @Autowired
    private PaymentsRepository paymentsrepos;

    @Override
    public Payment save(Payment payment)
    {
        return paymentsrepos.save(payment);
    }
}

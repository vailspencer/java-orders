package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Payments;
import com.lambdaschool.javavorders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentsServicesImpl implements PaymentsServices
{
    @Autowired
    private PaymentsRepository paymentsrepos;

    @Override
    public Payments save(Payments payemts)
    {
        return null;
    }
}

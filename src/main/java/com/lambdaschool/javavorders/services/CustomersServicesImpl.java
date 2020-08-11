package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Customers;
import com.lambdaschool.javavorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomersServicesImpl implements CustomersService
{
    @Autowired
    private CustomersRepository customersrepos;

    @Override
    public Customers save(Customers customers)
    {
        return null;
    }
}

package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Customer;
import com.lambdaschool.javavorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomersServicesImpl implements CustomersService
{
    @Autowired
    private CustomersRepository customersrepos;

    @Override
    public Customer save(Customer customer)
    {
        return customersrepos.save(customer);
    }
}

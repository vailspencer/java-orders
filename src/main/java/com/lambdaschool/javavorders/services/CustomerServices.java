package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Customer;

import java.util.List;

public interface CustomerServices
{
    Customer save(Customer customer);

    List<Customer> findAllOrders();

    Customer FindById(long custcode);

    List<Customer> FindByName(String name);
}

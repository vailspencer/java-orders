package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Order;
import com.lambdaschool.javavorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersServicesImpl implements OrdersServices
{
    @Autowired
    private OrdersRepository ordersrepos;

    @Override
    public Order save(Order order)
    {
        return ordersrepos.save(order);
    }
}

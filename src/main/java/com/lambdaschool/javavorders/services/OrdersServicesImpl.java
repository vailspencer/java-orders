package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Orders;
import com.lambdaschool.javavorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersServicesImpl implements OrdersServices
{
    @Autowired
    private OrdersRepository ordersrepos;

    @Override
    public Orders save(Orders orders)
    {
        return null;
    }
}

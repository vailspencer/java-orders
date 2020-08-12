package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Order;
import com.lambdaschool.javavorders.views.AdvanceOrders;

import java.util.List;

public interface OrderServices
{
    Order save(Order order);

    Order getOrderById(long id);

    List<AdvanceOrders> listAdvanceOrders();
}

package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Order;
import com.lambdaschool.javavorders.repositories.OrdersRepository;
import com.lambdaschool.javavorders.views.AdvanceOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    private OrdersRepository ordersrepos;

    @Override
    public Order save(Order order)
    {
        return ordersrepos.save(order);
    }

    @Override
    public Order getOrderById(long id)
    {
        return ordersrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Agent ID: " + id + " is not found."));
    }

    @Override
    public List<AdvanceOrders> listAdvanceOrders()
    {
        return ordersrepos.getAdvanceOrders();
    }
}

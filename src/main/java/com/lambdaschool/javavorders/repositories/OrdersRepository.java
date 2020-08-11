package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
}

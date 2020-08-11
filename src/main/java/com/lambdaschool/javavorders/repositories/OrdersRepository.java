package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long>
{
}

package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
}

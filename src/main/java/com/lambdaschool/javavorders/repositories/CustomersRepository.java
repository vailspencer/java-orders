package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
}

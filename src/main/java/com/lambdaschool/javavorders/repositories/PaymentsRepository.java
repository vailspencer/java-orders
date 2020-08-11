package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payment, Long>
{
}

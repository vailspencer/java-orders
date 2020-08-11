package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long>
{
}

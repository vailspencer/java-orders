package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long>
{
}

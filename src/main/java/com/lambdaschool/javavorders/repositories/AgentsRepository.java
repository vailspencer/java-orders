package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents, Long>
{
}

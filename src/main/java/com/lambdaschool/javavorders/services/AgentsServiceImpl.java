package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Agent;
import com.lambdaschool.javavorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AgentsServiceImpl implements AgentsService
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Override
    public Agent save(Agent agent) {
        return agentsrepos.save(agent);
    }
}

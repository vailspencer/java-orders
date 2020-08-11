package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Agents;
import com.lambdaschool.javavorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AgentsServiceImpl implements AgentsService
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Override
    public Agents save(Agents agents) {
        return null;
    }
}

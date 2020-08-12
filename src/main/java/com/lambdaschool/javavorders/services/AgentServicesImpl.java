package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Agent;
import com.lambdaschool.javavorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Override
    public Agent save(Agent agent) {
        return agentsrepos.save(agent);
    }

    @Override
    public Agent getAgentById(long id)
    {
        return agentsrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Agent ID: " + id + " is not found.")    );
    }
}

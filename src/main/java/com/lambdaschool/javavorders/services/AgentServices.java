package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Agent;

public interface AgentServices
{
    Agent save (Agent agent);

    Agent getAgentById(long id);
}

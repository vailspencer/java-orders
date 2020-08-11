package com.lambdaschool.javavorders.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agents
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long agentcode;

    @Column(nullable = false)
    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;

    public Agents()
    {
    }

    public Agents(
        String agentname,
        String workingarea,
        double commission,
        String phone,
        String country)
    {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    public String getAgentname()
    {
        return agentname;
    }

    public void setAgentname(String agentname)
    {
        this.agentname = agentname;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "Agents{" +
            "agentcode=" + agentcode +
            ", agentname='" + agentname + '\'' +
            ", workingarea='" + workingarea + '\'' +
            ", commission=" + commission +
            ", phone='" + phone + '\'' +
            ", country='" + country + '\'' +
            '}';
    }
}

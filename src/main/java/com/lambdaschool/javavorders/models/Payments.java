package com.lambdaschool.javavorders.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;
    private String type;

    public Payments()
    {
    }

    public Payments(String type)
    {
        this.type = type;
    }

    public void setPaymentid(long paymentid)
    {
        this.paymentid = paymentid;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}

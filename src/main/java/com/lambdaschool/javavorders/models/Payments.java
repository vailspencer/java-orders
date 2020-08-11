package com.lambdaschool.javavorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;
    @Column(nullable = false)
    private String type;

    @ManyToMany(mappedBy = "payments")
    private Set<Orders> orders = new HashSet<>();

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

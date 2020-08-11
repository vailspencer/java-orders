package com.lambdaschool.javavorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;
    private double ordamount;
    private double advanceamount;

    @ManyToOne
    @JoinColumn(name = "custcode",nullable = false)
    private Customer customer;
    private String orderdescription;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
        joinColumns = @JoinColumn(name = "ordnum"),
        inverseJoinColumns = @JoinColumn(name = "paymentid"))
    private Set<Payment> payments = new HashSet<>();



    public Order()
    {
    }

    public Order(
        double ordamount,
        double advanceamount,
        Customer customer,
        String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.customer = customer;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public Customer getCustomers()
    {
        return customer;
    }

    public void setCustomers(Customer customer)
    {
        this.customer = customer;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    @Override
    public String toString()
    {
        return "Order{" +
            "ordnum=" + ordnum +
            ", ordamount=" + ordamount +
            ", advanceamount=" + advanceamount +
            //", custcode=" + custcode +
            ", orderdescription='" + orderdescription + '\'' +
            '}';
    }
}

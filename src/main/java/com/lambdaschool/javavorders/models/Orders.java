package com.lambdaschool.javavorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;
    private double ordamount;
    private double advanceamount;

    @ManyToOne
    @JoinColumn(name = "custcode",nullable = false)
    private Customers customer;
    private String orderdescription;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
        joinColumns = @JoinColumn(name = "ordnum"),
        inverseJoinColumns = @JoinColumn(name = "paymentid"))
    private Set<Payments> payments = new HashSet<>();



    public Orders()
    {
    }

    public Orders(
        double ordamount,
        double advanceamount,
        Customers customers,
        String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.customer = customers;
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

    public Customers getCustomers()
    {
        return customer;
    }

    public void setCustomers(Customers customers)
    {
        this.customer = customers;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    @Override
    public String toString()
    {
        return "Orders{" +
            "ordnum=" + ordnum +
            ", ordamount=" + ordamount +
            ", advanceamount=" + advanceamount +
            //", custcode=" + custcode +
            ", orderdescription='" + orderdescription + '\'' +
            '}';
    }
}

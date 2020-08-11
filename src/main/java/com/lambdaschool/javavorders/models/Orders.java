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
    private long custcode;
    private String orderdescription;

    @ManyToMany(mappedBy = "paymets")
    private Set<Orders> orders = new HashSet<>();



    public Orders()
    {
    }

    public Orders(
        double ordamount,
        double advanceamount,
        long custcode,
        String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public long getCustcode()
    {
        return custcode;
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
            ", custcode=" + custcode +
            ", orderdescription='" + orderdescription + '\'' +
            '}';
    }
}

package com.lambdaschool.javavorders.services;

import com.lambdaschool.javavorders.models.Customer;
import com.lambdaschool.javavorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository customersrepos;

    @Override
    public Customer save(Customer customer)
    {
        return customersrepos.save(customer);
    }

    @Override
    public List<Customer> findAllOrders()
    {
        List<Customer> list = new ArrayList<>();
        customersrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer FindById(long id)
    {
        return customersrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Customer ID: " + id + " is not found."));
    }

    @Override
    public List<Customer> FindByName(String name)
    {
        List<Customer> rtn = new ArrayList<>();
        rtn = customersrepos.findByCustnameContainingIgnoringCase(name);
        if(rtn == null) {
            throw new EntityNotFoundException("Customers with name " + name + " Not found.");
        }
        return rtn;
    }
}

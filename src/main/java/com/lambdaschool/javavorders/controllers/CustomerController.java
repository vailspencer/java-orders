package com.lambdaschool.javavorders.controllers;

import com.lambdaschool.javavorders.models.Customer;
import com.lambdaschool.javavorders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{

    @Autowired
    private CustomerServices customerServices;

    // http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listCustomerOrders() {
        List<Customer> ordersList = customerServices.findAllOrders();
        return new ResponseEntity<>(ordersList, HttpStatus.OK);
    }

    //http://localhost:2019/customers/customer/7

    @GetMapping(value = "/customer/{id}", produces = "application/json")
    public ResponseEntity<?> getCustomerById(@PathVariable long id)  {
        Customer rtn = customerServices.FindById(id);
        return new ResponseEntity<>(rtn, HttpStatus.OK);
    }

    //http://localhost:2019/customers/namelike/mes
    @GetMapping(value = "/namelike/{name}", produces = "application/json")
    public ResponseEntity<?> getByName(@PathVariable String name) {
        List <Customer> rtn = customerServices.FindByName(name);
        return new ResponseEntity<>(rtn, HttpStatus.OK);
    }

}

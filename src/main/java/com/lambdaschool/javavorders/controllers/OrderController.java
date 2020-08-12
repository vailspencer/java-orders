package com.lambdaschool.javavorders.controllers;

import com.lambdaschool.javavorders.models.Order;
import com.lambdaschool.javavorders.services.OrderServices;
import com.lambdaschool.javavorders.views.AdvanceOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController
{
    @Autowired
    private OrderServices orderServices;

    //http://localhost:2019/orders/order/7
    @GetMapping(value = "order/{id}", produces = "application/json")
    public ResponseEntity<?> getOrderById(@PathVariable long id) {
        Order rtn = orderServices.getOrderById(id);
        return new ResponseEntity<>(rtn, HttpStatus.OK);
    }

    @GetMapping(value = "/advanceamount", produces = {"application/json"})
    public ResponseEntity<?> listOrdersByAdvanceamount(){
        List<AdvanceOrders> rtn = orderServices.listAdvanceOrders();
        return new ResponseEntity<>(rtn, HttpStatus.OK);
    }
}

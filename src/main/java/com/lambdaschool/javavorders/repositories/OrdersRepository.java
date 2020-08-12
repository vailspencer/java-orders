package com.lambdaschool.javavorders.repositories;

import com.lambdaschool.javavorders.models.Order;
import com.lambdaschool.javavorders.views.AdvanceOrders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
    @Query(value = "SELECT  o.ordnum as ordnum, o.advanceamount as advanceamount, o.ordamount as ordamount, o.orderdescription as orderdescription, c.custcode as custcode, c.custcity as custcity, c.custcountry as custcountry, c.custname as custname, c.grade as grade, c.openingamt as openingamt, c.outstandingamt as outstandingamt, c.paymentamt as paymentamt, c.phone as phone, c.receiveamt as receiveamt, c.workingarea as workingarea, c.agentcode as agentcode " +
        "FROM orders o LEFT JOIN customers c " +
        "ON o.custcode = c.custcode " +
        "WHERE advanceamount > 0", nativeQuery = true)
    List<AdvanceOrders> getAdvanceOrders();
}

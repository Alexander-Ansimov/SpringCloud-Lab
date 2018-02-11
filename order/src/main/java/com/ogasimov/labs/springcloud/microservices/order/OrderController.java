package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @HystrixCommand
    @PostMapping("/order/{tableId}")
    public Integer createOrder(@PathVariable Integer tableId, @RequestBody List<Integer> menuItems) {
        return orderService.createOrder(tableId, menuItems);
    }
}

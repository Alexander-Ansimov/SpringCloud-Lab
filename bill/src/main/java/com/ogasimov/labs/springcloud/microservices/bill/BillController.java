package com.ogasimov.labs.springcloud.microservices.bill;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
    @Autowired
    private BillService billService;

    @HystrixCommand
    @PostMapping("/bill/{tableId}/{orderId}")
    public void createBill(@PathVariable Integer tableId, @PathVariable Integer orderId) {
        billService.createBill(tableId, orderId);
    }

    @HystrixCommand(fallbackMethod = "defaultAnswer")
    @DeleteMapping("/bills/{tableId}")
    public void payBills(@PathVariable Integer tableId) {
        billService.payBills(tableId);
    }

    public void defaultAnswer(Integer tableId, Throwable t) {

    }
}

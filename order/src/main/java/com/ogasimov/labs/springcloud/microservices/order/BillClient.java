package com.ogasimov.labs.springcloud.microservices.order;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("bill")
public interface BillClient {

    @HystrixCommand
    @PostMapping("/bill/{tableId}/{orderId}")
    void createBill(@PathVariable("tableId") Integer tableId, @PathVariable("orderId") Integer orderId);

    @HystrixCommand
    @DeleteMapping("/bills/{orderId}")
    void payBills(@PathVariable("orderId") Integer orderId);
}

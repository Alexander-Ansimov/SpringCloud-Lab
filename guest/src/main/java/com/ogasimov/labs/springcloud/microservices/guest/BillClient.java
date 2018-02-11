package com.ogasimov.labs.springcloud.microservices.guest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("bill")
public interface BillClient {

    @HystrixCommand
    @DeleteMapping("/bills/{tableId}")
    void payBills(@PathVariable("tableId") Integer tableId);
}

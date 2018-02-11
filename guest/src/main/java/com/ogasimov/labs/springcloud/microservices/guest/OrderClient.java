package com.ogasimov.labs.springcloud.microservices.guest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("order")
public interface OrderClient {

    @HystrixCommand
    @PostMapping("/order/{tableId}")
    Integer createOrder(@PathVariable("tableId") Integer tableId, @RequestBody List<Integer> menuItems);
}

package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("stock")
public interface StockClient {

    @HystrixCommand
    @DeleteMapping("/stock")
    void minusFromStock(@RequestBody List<Integer> menuItems);
}

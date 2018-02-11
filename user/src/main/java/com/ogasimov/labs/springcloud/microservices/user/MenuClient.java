package com.ogasimov.labs.springcloud.microservices.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("order")
public interface MenuClient {

    @GetMapping("/menu")
    Map<Integer, String> getMenu();
}

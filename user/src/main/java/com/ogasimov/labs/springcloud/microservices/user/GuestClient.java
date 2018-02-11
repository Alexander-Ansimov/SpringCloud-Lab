package com.ogasimov.labs.springcloud.microservices.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("guest")
public interface GuestClient {

    @PostMapping("/dinner")
    Integer startDinner(@RequestBody List<Integer> menuItems);

    @DeleteMapping("/dinner/{tableId}")
    void finishDinner(@PathVariable("tableId") Integer tableId);

}

package com.ogasimov.labs.springcloud.microservices.guest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("table")
public interface TableClient {

    @HystrixCommand
    @GetMapping("/tables")
    List<Integer> getFreeTables();

    @HystrixCommand
    @GetMapping("/tables/free")
    void freeTable(@PathVariable("id") Integer id);

    @HystrixCommand
    @PutMapping("/table/{id}/occupy")
    void occupyTable(@PathVariable("id") Integer id);
}

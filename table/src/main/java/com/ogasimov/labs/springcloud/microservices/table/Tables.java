package com.ogasimov.labs.springcloud.microservices.table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Tables {
    public static void main(String[] args) {
        SpringApplication.run(Tables.class, args);
    }
}

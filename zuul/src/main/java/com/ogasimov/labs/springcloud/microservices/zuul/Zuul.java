package com.ogasimov.labs.springcloud.microservices.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableHystrix
@EnableZuulProxy
public class Zuul {
    public static void main(String[] args) {
        SpringApplication.run(Zuul.class, args);
    }
}

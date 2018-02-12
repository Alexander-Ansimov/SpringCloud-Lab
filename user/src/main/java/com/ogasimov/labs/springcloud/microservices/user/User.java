package com.ogasimov.labs.springcloud.microservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EnableHystrix
@EnableScheduling
@EnableEurekaClient
@EnableFeignClients
public class User {

    @Autowired
    private Runner runner;

    public static void main(String[] args) {
        SpringApplication.run(User.class, args);
    }

    @PostConstruct
    public void start() {
        runner.run();
    }
}

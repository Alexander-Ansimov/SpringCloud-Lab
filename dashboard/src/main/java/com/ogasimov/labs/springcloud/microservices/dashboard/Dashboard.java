package com.ogasimov.labs.springcloud.microservices.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class Dashboard {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard.class, args);
    }
}

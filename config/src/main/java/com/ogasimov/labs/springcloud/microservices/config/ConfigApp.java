package com.ogasimov.labs.springcloud.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class, args);
    }
}

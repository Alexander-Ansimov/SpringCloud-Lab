package com.ogasimov.labs.springcloud.microservices.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinServer
@EnableZipkinStreamServer
public class ZipkinApp {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApp.class, args);
    }
}

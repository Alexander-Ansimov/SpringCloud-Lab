package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class RefreshData {

    @Value("${testEventNumber}")
    private String testEventNumber;

    public String getTestEventNumber() {
        return testEventNumber;
    }

}

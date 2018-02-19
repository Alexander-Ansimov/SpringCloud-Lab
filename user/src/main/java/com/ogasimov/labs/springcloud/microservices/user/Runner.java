package com.ogasimov.labs.springcloud.microservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class Runner {

    @Autowired
    private GuestClient guestClient;

    @Autowired
    private MenuClient menuClient;

    @Value("${testValue}")
    private volatile String testValue;

    @Scheduled(fixedDelay = 2000)
    public void run() {

        int range = (5 - 1) + 1;
        int i = (int) (Math.random() * range) + 1;


        System.out.println(testValue);

   //     guestClient.startDinner(menuClient.getMenu());
        try {
   //         guestClient.finishDinner(i);
        } catch (Exception e) {

        }

    }
}

package com.ogasimov.labs.springcloud.microservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Runner {

    @Autowired
    private GuestClient guestClient;

    @Autowired
    private MenuClient menuClient;

    @Scheduled(fixedDelay = 2000)
    public void run() {

        int range = (5 - 1) + 1;
        int i = (int) (Math.random() * range) + 1;



   //     guestClient.startDinner(menuClient.getMenu());
        try {
            guestClient.finishDinner(i);
        } catch (Exception e) {

        }

    }
}

package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
    @Autowired
    private DinnerService dinnerService;

    @Value("testEvent")
    private Integer testEventNumber;

    @PostMapping("/dinner")
    public Integer startDinner(@RequestBody List<Integer> menuItems) {
        return testEventNumber + dinnerService.startDinner(menuItems);
    }

    @DeleteMapping("/dinner/{tableId}")
    public void finishDinner(@PathVariable Integer tableId) {
        dinnerService.finishDinner(tableId);
    }
}

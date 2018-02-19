package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class GuestController {

    @Autowired
    private DinnerService dinnerService;
    @Autowired
    private RefreshData refreshData;

    @PostMapping("/dinner")
    public Integer startDinner(@RequestBody List<Integer> menuItems) {
        return dinnerService.startDinner(menuItems);
    }

    @GetMapping
    public Integer getRefreshedValue() {
        return Integer.parseInt(refreshData.getTestEventNumber());
    }

    @DeleteMapping("/dinner/{tableId}")
    public void finishDinner(@PathVariable Integer tableId) {
        dinnerService.finishDinner(tableId);
    }
}

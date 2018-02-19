package com.ogasimov.labs.springcloud.microservices.table;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TableController {

    @Autowired
    private TableService tableService;

    @Value("${testValue}")
    private String testValue;

    @HystrixCommand
    @GetMapping("/tables")
    public List<Integer> getTables() {
        return tableService.getTableIds();
    }

    @HystrixCommand
    @GetMapping("/tables/free")
    public List<Integer> getFreeTables() {
        return tableService.getFreeTableIds();
    }

    @HystrixCommand
    @PutMapping("/table/{id}/free")
    public void freeTable(@PathVariable Integer id) {
        tableService.updateTable(id, true);
    }

    @HystrixCommand
    @PutMapping("/table/{id}/occupy")
    public void occupyTable(@PathVariable Integer id) {
        tableService.updateTable(id, false);
    }

    @GetMapping
    public String getTestValue() {
        return "testValue = " + testValue;
    }
}

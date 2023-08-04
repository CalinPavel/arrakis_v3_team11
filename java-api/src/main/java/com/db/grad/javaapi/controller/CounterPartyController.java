package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.service.BookUserHandler;
import com.db.grad.javaapi.service.CounterPartyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class CounterPartyController {

    private CounterPartyHandler counterPartyService;

    @Autowired
    public CounterPartyController(CounterPartyHandler cph) {
        counterPartyService = cph;
    }

    @GetMapping("/counterparties")
    public List<CounterParty> getAllCounterParties() {
        return counterPartyService.getCounterPartyUsers();
    }
}

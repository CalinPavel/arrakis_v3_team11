package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.CounterPartyHandler;
import com.db.grad.javaapi.service.TradeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeController {

    private TradeHandler tradeService;

    @Autowired
    public TradeController(TradeHandler th){
        tradeService = th;
    }

    @GetMapping("/trades")
    public List<Trade> getAllTrades(){
        return tradeService.getAllTrades();
    }


    @GetMapping("/trades/{dateRequest}")
    public List<Trade> getSecurityBy5DaysBondsDate(@PathVariable(value = "dateRequest") String dateRequest){
        return tradeService.getTradesByDate(dateRequest);
    }
}


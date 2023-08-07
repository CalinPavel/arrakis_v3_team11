package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;

import java.util.List;

public interface ITradeService {
    Trade saveTrade(Trade trade);
    Trade getTradeById(Integer tradeId);
    List<Trade> getAllTrades();
    void deleteTrade(Integer tradeId);
}

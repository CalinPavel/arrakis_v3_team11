package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeHandler implements ITradeService{

    private TradeRepository tradeRepository;

    @Autowired
    public TradeHandler(TradeRepository tradeRepository){
        this.tradeRepository= tradeRepository;
    }

    @Override
    public Trade saveTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    @Override
    public Trade getTradeById(Integer tradeId) {
        return tradeRepository.findById(tradeId).orElse(null);
    }

    @Override
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    @Override
    public void deleteTrade(Integer tradeId) {
        tradeRepository.deleteById(tradeId);
    }

}

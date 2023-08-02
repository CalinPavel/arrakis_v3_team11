package com.db.grad.javaapi.repository;


import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Integer> {
}

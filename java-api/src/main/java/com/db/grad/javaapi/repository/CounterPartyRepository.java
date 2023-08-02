package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.CounterParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterPartyRepository extends JpaRepository<CounterParty, Integer> {
}

package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.repository.CounterPartyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounterPartyHandler implements ICounterPartyService {

    private final CounterPartyRepository counterPartyRepository;

    public CounterPartyHandler(CounterPartyRepository counterPartyRepository) {
        this.counterPartyRepository = counterPartyRepository;
    }


    @Override
    public CounterParty saveCounterParty(CounterParty counterParty) {
        return counterPartyRepository.save(counterParty);
    }

    @Override
    public CounterParty getCounterPartyId(Integer counterPartyId) {
       return counterPartyRepository.findById(counterPartyId).orElse(null);
    }

    @Override
    public List<CounterParty> getCounterPartyUsers() {
        return counterPartyRepository.findAll();
    }

    @Override
    public void deleteCounterParty(Integer counterPartyId) {
        counterPartyRepository.deleteById(counterPartyId);
    }
}

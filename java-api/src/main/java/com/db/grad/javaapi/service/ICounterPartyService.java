package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.CounterParty;

import java.util.List;

public interface ICounterPartyService {

    public CounterParty saveCounterParty(CounterParty counterParty);
    public CounterParty getCounterPartyId(Integer counterPartyId);
    public List<CounterParty> getCounterPartyUsers();
    public void deleteCounterParty(Integer counterPartyId);

}

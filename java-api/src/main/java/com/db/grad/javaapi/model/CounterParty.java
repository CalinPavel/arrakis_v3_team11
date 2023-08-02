package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "counter_party")
public class CounterParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counter_party_id")
    private Integer counterPartyId;

    @Column(name = "bond_holder", length = 100, nullable = false)
    private String bondHolder;

    public Integer getCounterPartyId() {
        return counterPartyId;
    }

    public String getBondHolder() {
        return bondHolder;
    }

    public void setCounterPartyId(Integer counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }
}

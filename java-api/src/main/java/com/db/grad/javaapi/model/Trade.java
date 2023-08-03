package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trade")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tradeId;

    @Column(length = 10, nullable = false)
    private String tradeType;

    @Column(length = 10, nullable = false)
    private String tradeCurrency;

    @Column(nullable = false)
    private int quantity;

    @Column(length = 50, nullable = false)
    private String tradeSettlementDate;

    @Column(length = 10, nullable = false)
    private String tradeStatus;

    @Column(length = 50, nullable = false)
    private String tradeDate;

    @Column(length = 50)
    private String cusip;

    @Column(length = 50, nullable = false)
    private String isin;

    @Column(length = 100)
    private String issuerName;

    @ManyToOne
    @JoinColumn(name = "security_id", referencedColumnName = "security_id")
    private Security security;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "counter_party_id", referencedColumnName = "counter_party_id")
    private CounterParty counterParty;

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTradeSettlementDate(String tradeSettlementDate) {
        this.tradeSettlementDate = tradeSettlementDate;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setCounterParty(CounterParty counterParty) {
        this.counterParty = counterParty;
    }

    public int getTradeId() {
        return tradeId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTradeSettlementDate() {
        return tradeSettlementDate;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public String getCusip() {
        return cusip;
    }

    public String getIsin() {
        return isin;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public Security getSecurity() {
        return security;
    }

    public Book getBook() {
        return book;
    }

    public CounterParty getCounterParty() {
        return counterParty;
    }
}

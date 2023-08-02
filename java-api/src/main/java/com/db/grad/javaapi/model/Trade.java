package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trade")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_id")
    private Integer tradeId;

    @Column(name = "trade_type", length = 10, nullable = false)
    private String tradeType;

    @Column(name = "trade_currency", length = 10, nullable = false)
    private String tradeCurrency;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "trade_settlement_date", nullable = false)
    private Date tradeSettlementDate;

    @Column(name = "trade_status", length = 10, nullable = false)
    private String tradeStatus;

    @Column(name = "trade_date", nullable = false)
    private Date tradeDate;

    @ManyToOne
    @JoinColumn(name = "security_id", referencedColumnName = "security_id")
    private Security security;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "counter_party_id", referencedColumnName = "counter_party_id")
    private CounterParty counterParty;

    public Integer getTradeId() {
        return tradeId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Date getTradeSettlementDate() {
        return tradeSettlementDate;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public Date getTradeDate() {
        return tradeDate;
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

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setTradeSettlementDate(Date tradeSettlementDate) {
        this.tradeSettlementDate = tradeSettlementDate;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
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
}

package com.db.grad.javaapi.dto;

import java.util.Date;

public class Bond {

    private String cusip;
    private String isin;
    private String bondCurrency;
    private String bondMaturityDate;
    private double couponPercent;
    private double unitPrice;
    private double faceValue;
    private String issuerName;
    private String type;
    private String status;
    private String bondHolder;
    private String bookName;


    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setBondCurrency(String bondCurrency) {
        this.bondCurrency = bondCurrency;
    }

    public void setBondMaturityDate(String bondMaturityDate) {
        this.bondMaturityDate = bondMaturityDate;
    }

    public void setCouponPercent(double couponPercent) {
        this.couponPercent = couponPercent;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBondHolder(String bondHolder) {
        this.bondHolder = bondHolder;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCusip() {
        return cusip;
    }

    public String getIsin() {
        return isin;
    }

    public String getBondCurrency() {
        return bondCurrency;
    }

    public String getBondMaturityDate() {
        return bondMaturityDate;
    }

    public double getCouponPercent() {
        return couponPercent;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getBondHolder() {
        return bondHolder;
    }

    public String getBookName() {
        return bookName;
    }
}

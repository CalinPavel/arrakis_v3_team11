package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")

    private int securityId;

    @Column(length = 50)
    private String cusip;

    @Column(length = 50, nullable = false)
    private String isin;

    @Column(length = 10, nullable = false)
    private String bondCurrency;

    @Column(length = 50, nullable = false)
    private String bondMaturityDate;

    @Column(nullable = false)
    private Double couponPercent;

    @Column(nullable = false)
    private Double unitPrice;

    @Column(nullable = false)
    private int faceValue;

    @Column(length = 100, nullable = false)
    private String issuerName;

    @Column(length = 50, nullable = false)
    private String type;

    @Column(length = 50, nullable = false)
    private String status;

    public int getSecurityId() {
        return securityId;
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

    public Double getCouponPercent() {
        return couponPercent;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public int getFaceValue() {
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

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

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

    public void setCouponPercent(Double couponPercent) {
        this.couponPercent = couponPercent;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setFaceValue(int faceValue) {
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
}

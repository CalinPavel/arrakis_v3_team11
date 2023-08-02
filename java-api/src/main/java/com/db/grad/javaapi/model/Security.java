package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    private Integer securityId;

    @Column(name = "cusip", length = 50)
    private String cusip;

    @Column(name = "isin", length = 50, nullable = false)
    private String isin;

    @Column(name = "bond_currency", length = 10, nullable = false)
    private String bondCurrency;

    @Column(name = "bond_maturity_date", nullable = false)
    private Date bondMaturityDate;

    @Column(name = "coupon_percent", nullable = false)
    private Double couponPercent;

    @Column(name = "unit_price", nullable = false)
    private Double unitPrice;

    @Column(name = "face_value", nullable = false)
    private Integer faceValue;

    @Column(name = "issuer_name", length = 100, nullable = false)
    private String issuerName;

    @Column(name = "type", length = 50, nullable = false)
    private String type;

    @Column(name = "status", length = 50, nullable = false)
    private String status;

    public Integer getSecurityId() {
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

    public Date getBondMaturityDate() {
        return bondMaturityDate;
    }

    public Double getCouponPercent() {
        return couponPercent;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public String getType() {
        return type;
    }

    public void setSecurityId(Integer securityId) {
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

    public void setBondMaturityDate(Date bondMaturityDate) {
        this.bondMaturityDate = bondMaturityDate;
    }

    public void setCouponPercent(Double couponPercent) {
        this.couponPercent = couponPercent;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

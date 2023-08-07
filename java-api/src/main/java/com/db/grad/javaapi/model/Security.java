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

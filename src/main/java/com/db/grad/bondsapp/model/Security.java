package com.db.grad.bondsapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Security")
public class Security {

    @Id
    private long securityId;

    private long isin;

    private long cusip;

    private String issuer;

    private Date maturityDate;

    private long coupon;

    private String type;

    private long faceValue;

    private String status;

    @Id
    public long getSecurityId() {
        return securityId;
    }
    public void setSecurityId(long setSecurityId) {
        this.securityId = setSecurityId;
    }

    @Column(name = "maturityDate", nullable = false)
    public Date getMaturityDate() {
        return maturityDate;
    }
    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    @Column(name = "coupon")
    public long getCoupon() {
        return coupon;
    }
    public void setCoupon(long coupon) {
        this.coupon = coupon;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "issuer")
    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Column(name = "faceValue")
    public long getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(long faceValue) {
        this.faceValue = faceValue;
    }

    @Column(name = "isin")
    public long getIsin() {
        return isin;
    }
    public void setIsin(long isin) {
        this.isin = isin;
    }

    @Column(name = "cusip")
    public long getCusip() {
        return cusip;
    }
    public void setCusip(long cusip) {
        this.cusip = cusip;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

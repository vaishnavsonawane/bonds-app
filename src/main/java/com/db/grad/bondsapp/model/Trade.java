package com.db.grad.bondsapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Trade")
public class Trade {

    @Id
    private long tradeId;

    private long bookId;

    private long counterpartyId;

    private long securityId;

    private long quantity;

    private String status;

    private long price;

    private String buy_sell;

    private Date tradeDate;

    private Date settlementDate;
    @Id
    @Column(name = "tradeId", nullable = false)
    public long getTradeId() {
        return tradeId;
    }
    public void setTradeId(long tradeId) {
        this.tradeId = tradeId;
    }

    @Column(name = "bookId", nullable = false)
    public long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Column(name = "counterpartyId", nullable = false)
    public long getCounterpartyId() {
        return counterpartyId;
    }
    public void setCounterpartyId(long counterpartyId) {
        this.counterpartyId = counterpartyId;
    }

    @Column(name = "securityId", nullable = false)
    public long getSecurityId() {
        return securityId;
    }
    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    @Column(name = "quantity")
    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    @Column(name = "price")
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "buy_sell")
    public String getBuy_sell() {
        return buy_sell;
    }
    public void setBuy_sell(String buy_sell) {
        this.buy_sell = buy_sell;
    }

    @Column(name = "tradeDate")
    public Date getTradeDate() {
        return tradeDate;
    }
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Column(name = "settlementDate" )
    public Date getSettlementDate() {
        return settlementDate;
    }
    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

}

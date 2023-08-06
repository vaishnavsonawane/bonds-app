package com.db.grad.bondsapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Counterparty")
public class Counterparty {

    @Id
    private long counterpartyId;
    private String counterpartyName;

    @Id
    @Column(name = "counterpartyId", nullable = false)
    public long getCounterpartyId() {
        return counterpartyId;
    }
    public void setCounterpartyId(long counterpartyId) {
        this.counterpartyId = counterpartyId;
    }

    @Column(name = "counterpartyName", nullable = false)
    public String getCounterpartyName() {
        return counterpartyName;
    }
    public void setCounterpartyName(String counterpartyName) {
        this.counterpartyName = counterpartyName;
    }


}

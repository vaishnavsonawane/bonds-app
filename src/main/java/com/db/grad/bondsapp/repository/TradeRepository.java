package com.db.grad.bondsapp.repository;

import com.db.grad.bondsapp.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository  extends JpaRepository<Trade, Long> {
}

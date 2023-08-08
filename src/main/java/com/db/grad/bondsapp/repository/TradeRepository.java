package com.db.grad.bondsapp.repository;

import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeRepository  extends JpaRepository<Trade, Long> {
    List<Trade> findByTradeId(long tradeId);
    @Query("SELECT s FROM Security s INNER JOIN Trade t ON s.securityId = t.securityId WHERE t.id = ?1")
    List<Security>findSecurityByTradeId(long tradeId);

}

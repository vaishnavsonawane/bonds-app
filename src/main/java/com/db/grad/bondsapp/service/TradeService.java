package com.db.grad.bondsapp.service;

import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.model.Trade;
import com.db.grad.bondsapp.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeService {
    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }
    public List<Trade> getTradeByTradeId(long tradeId) {
        return tradeRepository.findByTradeId(tradeId);
    }
    public Trade addTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    public List<Security> getSecurityByTradeId(long tradeId) {
        return tradeRepository.findSecurityByTradeId(tradeId);
    }

}

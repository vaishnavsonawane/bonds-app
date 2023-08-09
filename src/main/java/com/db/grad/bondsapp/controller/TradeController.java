package com.db.grad.bondsapp.controller;

import com.db.grad.bondsapp.model.Security;
import com.db.grad.bondsapp.service.SecurityService;
import com.db.grad.bondsapp.model.Trade;
import com.db.grad.bondsapp.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trades")
@CrossOrigin(origins = "*")
public class TradeController {
    @Autowired
    private TradeService tradeService;
    @GetMapping(value = "get")
    public ResponseEntity getTrades() {
        List<Trade> response = tradeService.getAllTrades();
        return ResponseEntity.ok().body(response);
    }
    @GetMapping("get/{tradeId}")
    public ResponseEntity getTradeByTradeId(@PathVariable long tradeId) {
        List<Trade> response = tradeService.getTradeByTradeId(tradeId);
        return ResponseEntity.ok().body((response));
    }

    @PostMapping("/add")
    public Trade addTrade(@RequestBody Trade trade) {
        return tradeService.addTrade(trade);
    }
    @GetMapping("get/security/{tradeId}")
    public ResponseEntity getSecurityByTradeId(@PathVariable int tradeId) {
        List<Security> response = tradeService.getSecurityByTradeId(tradeId);
        return ResponseEntity.ok().body(response);
    }

}

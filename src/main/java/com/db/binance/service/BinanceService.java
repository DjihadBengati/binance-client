package com.db.binance.service;

import static org.slf4j.LoggerFactory.getLogger;

import com.db.binance.model.entity.wallet.SystemStatus;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BinanceService {

  private final Logger logger = getLogger(BinanceService.class);

  private final WalletService walletService;

  public BinanceService(WalletService walletService) {
    this.walletService = walletService;
  }

  public Mono<SystemStatus> walletSystemStatus() {
    return walletService.systemStatus();
  }
}

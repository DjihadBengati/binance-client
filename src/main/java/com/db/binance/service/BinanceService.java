package com.db.binance.service;

import static org.slf4j.LoggerFactory.getLogger;
import static reactor.core.publisher.Mono.just;

import com.db.binance.client.BinanceClient;
import com.db.binance.model.entity.wallet.SystemStatus;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BinanceService {

  private final Logger logger = getLogger(BinanceService.class);

  private final BinanceClient binanceClient;
  private final WalletService walletService;


  public BinanceService(BinanceClient binanceClient, WalletService walletService) {
    this.binanceClient = binanceClient;
    this.walletService = walletService;
  }

  public Mono<Boolean> apiPing() {
    return binanceClient.apiPing()
        .doOnSubscribe(s -> logger.debug("Calling API ping..."))
        .doOnSuccess(s -> logger.debug("API ping done."))
        .map(s -> Boolean.TRUE)
        .doOnError(t -> logger.debug("API ping error: {}.", t.getMessage()))
        .onErrorResume(t -> just(Boolean.FALSE));
  }

  public Mono<SystemStatus> walletSystemStatus() {
    return walletService.walletSystemStatus();
  }
}

package com.db.binance.service;

import com.db.binance.client.BinanceClient;
import com.db.binance.mapper.SystemStatusMapper;
import com.db.binance.model.entity.wallet.SystemStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WalletService {

  private final Logger logger = LoggerFactory.getLogger(WalletService.class);

  private final BinanceClient binanceClient;

  public WalletService(BinanceClient binanceClient) {
    this.binanceClient = binanceClient;
  }

  public Mono<SystemStatus> systemStatus() {
    return binanceClient.systemStatus()
        .doOnSubscribe(s -> logger.debug("Calling wallet system status..."))
        .doOnSuccess(s -> logger.debug("Wallet system status result: {}.", s))
        .map(SystemStatusMapper::map)
        .doOnError(t -> logger.debug("Wallet system status error: {}.", t.getMessage()))
        .onErrorResume(Mono::error);
  }
}

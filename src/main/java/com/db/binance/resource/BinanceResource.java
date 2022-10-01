package com.db.binance.resource;

import static com.db.binance.resource.ResourceConstants.API_V1;
import static com.db.binance.resource.ResourceConstants.PING;
import static com.db.binance.resource.ResourceConstants.WALLET_STATUS;

import com.db.binance.mapper.SystemStatusMapper;
import com.db.binance.model.resource.api.PingDto;
import com.db.binance.model.resource.wallet.WalletSystemStatusDto;
import com.db.binance.service.BinanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(API_V1)
public class BinanceResource {

  Logger logger = LoggerFactory.getLogger(BinanceResource.class);

  private final BinanceService service;

  public BinanceResource(BinanceService service) {
    this.service = service;
  }

  @GetMapping(PING)
  public Mono<PingDto> ping() {
    logger.info("Calling Binance API ping endpoint.");
    return service.apiPing().map(p -> new PingDto().setUp(p));
  }

  @GetMapping(WALLET_STATUS)
  public Mono<WalletSystemStatusDto> walletSystemStatus() {
    logger.info("Calling Binance API Wallets system status endpoint.");
    return service.walletSystemStatus().map(SystemStatusMapper::map);
  }
}

package com.db.binance.resource;

import static com.db.binance.resource.ResourceConstants.API_V1;
import static com.db.binance.resource.ResourceConstants.WALLET;
import static com.db.binance.resource.ResourceConstants.WALLET_STATUS;

import com.db.binance.mapper.SystemStatusMapper;
import com.db.binance.model.resource.wallet.SystemStatusDto;
import com.db.binance.service.BinanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(API_V1)
public class BinanceResource {

  private final BinanceService service;

  public BinanceResource(BinanceService service) {
    this.service = service;
  }

  @GetMapping(WALLET + WALLET_STATUS)
  public Mono<SystemStatusDto> systemStatus() {
    return service.walletSystemStatus().map(SystemStatusMapper::map);
  }
}

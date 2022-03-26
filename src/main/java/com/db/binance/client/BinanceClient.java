package com.db.binance.client;

import static com.db.binance.model.api.ApiConstants.BINANCE_WALLET_SYSTEM_STATUS;

import com.db.binance.model.api.wallet.SystemStatusApiDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;

public interface BinanceClient {

  @GET(BINANCE_WALLET_SYSTEM_STATUS)
  Mono<SystemStatusApiDto> systemStatus();
}

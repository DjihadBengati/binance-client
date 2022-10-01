package com.db.binance.client;

import static com.db.binance.model.api.ApiConstants.BINANCE_API_PING;
import static com.db.binance.model.api.ApiConstants.BINANCE_WALLET_SYSTEM_STATUS;

import com.db.binance.model.api.PingApiDto;
import com.db.binance.model.api.wallet.SystemStatusApiDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;

public interface BinanceClient {

  /**
   * <p>Test connectivity to the Rest API</p>
   * <p>GET /api/v3/ping</p>
   * <p>Binance documentation: <a
   * href="https://binance-docs.github.io/apidocs/spot/en/#test-connectivity">link</a></p>
   *
   * @return PingApiDto
   */
  @GET(BINANCE_API_PING)
  Mono<PingApiDto> apiPing();

  /**
   * <p>Fetch wallets system status.</p>
   * <p>GET /sapi/v1/system/status</p>
   * <p>Binance documentation: <a
   * href="https://binance-docs.github.io/apidocs/spot/en/#system-status-system">link</a></p>
   *
   * @return SystemStatusApiDto
   */
  @GET(BINANCE_WALLET_SYSTEM_STATUS)
  Mono<SystemStatusApiDto> walletSystemStatus();
}

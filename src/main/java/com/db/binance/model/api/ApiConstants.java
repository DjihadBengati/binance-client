package com.db.binance.model.api;

public final class ApiConstants {

  public static final String BINANCE_V1 = "/sapi/v1";

  public static final String BINANCE_V3 = "/api/v3";

  public static final String BINANCE_WALLET_SYSTEM_STATUS = BINANCE_V1 + "/system/status";

  public static final String BINANCE_API_PING = BINANCE_V3 + "/ping";

  private ApiConstants() {
  }
}

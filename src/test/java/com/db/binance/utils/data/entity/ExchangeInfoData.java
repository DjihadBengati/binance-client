package com.db.binance.utils.data.entity;

import static java.util.List.of;

import com.db.binance.model.entity.ExchangeInfo;
import com.db.binance.model.entity.Symbol;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public final class ExchangeInfoData {

  public static final String TIMEZONE_UTC = "UTC";

  public static final LocalDateTime SERVER_TIME = new Timestamp(1565246363776L).toLocalDateTime();

  public static final String SYMBOL_NAME = "ETHBTC";

  public static final String SYMBOL_STATUS = "TRADING";

  public static ExchangeInfo fullResponse() {
    return new ExchangeInfo().setTimezone(TIMEZONE_UTC)
        .setServerTime(SERVER_TIME)
        .setSymbols(of(fullSymbol()));
  }

  public static Symbol fullSymbol() {
    return new Symbol().setName(SYMBOL_NAME).setStatus(SYMBOL_STATUS);
  }
}

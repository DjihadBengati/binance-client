package com.db.binance.utils.data;

import com.db.binance.model.entity.ExchangeInfo;

public final class ExchangeInfoData {

  public static final String TIMEZONE_UTC = "UTC";

  public static ExchangeInfo fullResponse() {
    return new ExchangeInfo().setTimezone(TIMEZONE_UTC);
  }
}

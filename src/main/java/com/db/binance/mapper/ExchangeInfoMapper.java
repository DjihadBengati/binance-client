package com.db.binance.mapper;

import com.db.binance.model.api.ExchangeInfoApiDto;
import com.db.binance.model.entity.ExchangeInfo;

public final class ExchangeInfoMapper {

  private ExchangeInfoMapper() {
    throw new IllegalStateException("Mapper class");
  }

  public static ExchangeInfo map(ExchangeInfoApiDto apiDto) {
    return new ExchangeInfo().setTimezone(apiDto.getTimezone());
  }
}

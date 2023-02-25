package com.db.binance.mapper;

import static com.db.binance.mapper.SymbolMapper.mapEntities;

import com.db.binance.model.api.ExchangeInfoApiDto;
import com.db.binance.model.entity.ExchangeInfo;
import com.db.binance.model.resource.api.ExchangeInfoDto;
import java.sql.Timestamp;

public final class ExchangeInfoMapper {

  private ExchangeInfoMapper() {
    throw new IllegalStateException("Mapper class");
  }

  public static ExchangeInfo map(ExchangeInfoApiDto apiDto) {
    return new ExchangeInfo().setTimezone(apiDto.getTimezone())
        .setServerTime(new Timestamp(apiDto.getServerTime()).toLocalDateTime())
        .setSymbols(SymbolMapper.map(apiDto.getSymbols()));
  }

  public static ExchangeInfoDto map(ExchangeInfo entity) {
    return new ExchangeInfoDto().setTimezone(entity.getTimezone())
        .setServerTime(entity.getServerTime())
        .setSymbols(mapEntities(entity.getSymbols()));
  }
}

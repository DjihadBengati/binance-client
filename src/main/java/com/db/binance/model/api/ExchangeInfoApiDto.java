package com.db.binance.model.api;

import java.util.List;
import java.util.StringJoiner;

public class ExchangeInfoApiDto {

  private String timezone;

  private long serverTime;

  private List<SymbolApiDto> symbols;

  public String getTimezone() {
    return timezone;
  }

  public ExchangeInfoApiDto setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  public long getServerTime() {
    return serverTime;
  }

  public ExchangeInfoApiDto setServerTime(long serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  public List<SymbolApiDto> getSymbols() {
    return symbols;
  }

  public ExchangeInfoApiDto setSymbols(
      List<SymbolApiDto> symbols) {
    this.symbols = symbols;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ExchangeInfoApiDto.class.getSimpleName() + "[", "]")
        .add("timezone='" + timezone + "'")
        .add("serverTime=" + serverTime)
        .toString();
  }
}

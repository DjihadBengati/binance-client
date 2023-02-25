package com.db.binance.model.resource.api;

import java.time.LocalDateTime;
import java.util.List;

public class ExchangeInfoDto {

  private String timezone;

  private LocalDateTime serverTime;

  private List<SymbolDto> symbols;

  public String getTimezone() {
    return timezone;
  }

  public ExchangeInfoDto setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  public LocalDateTime getServerTime() {
    return serverTime;
  }

  public ExchangeInfoDto setServerTime(LocalDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  public List<SymbolDto> getSymbols() {
    return symbols;
  }

  public ExchangeInfoDto setSymbols(
      List<SymbolDto> symbols) {
    this.symbols = symbols;
    return this;
  }
}

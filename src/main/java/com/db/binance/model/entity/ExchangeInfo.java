package com.db.binance.model.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.StringJoiner;

public class ExchangeInfo {

  private String timezone;

  private LocalDateTime serverTime;

  private List<Symbol> symbols;

  public String getTimezone() {
    return timezone;
  }

  public ExchangeInfo setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  public LocalDateTime getServerTime() {
    return serverTime;
  }

  public ExchangeInfo setServerTime(LocalDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  public List<Symbol> getSymbols() {
    return symbols;
  }

  public ExchangeInfo setSymbols(List<Symbol> symbols) {
    this.symbols = symbols;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ExchangeInfo.class.getSimpleName() + "[", "]")
        .add("timezone='" + timezone + "'")
        .add("serverTime=" + serverTime)
        .toString();
  }
}

package com.db.binance.model.entity;

import java.util.StringJoiner;

public class ExchangeInfo {

  private String timezone;

  public String getTimezone() {
    return timezone;
  }

  public ExchangeInfo setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ExchangeInfo.class.getSimpleName() + "[", "]")
        .add("timezone='" + timezone + "'")
        .toString();
  }
}

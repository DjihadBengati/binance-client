package com.db.binance.model.api;

import java.util.StringJoiner;

public class ExchangeInfoApiDto {

  private String timezone;

  public String getTimezone() {
    return timezone;
  }

  public ExchangeInfoApiDto setTimezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ExchangeInfoApiDto.class.getSimpleName() + "[", "]")
        .add("timezone='" + timezone + "'")
        .toString();
  }
}

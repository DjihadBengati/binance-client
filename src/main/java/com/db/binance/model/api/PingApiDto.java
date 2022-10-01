package com.db.binance.model.api;

import java.util.StringJoiner;

public class PingApiDto {

  @Override
  public String toString() {
    return new StringJoiner(", ", PingApiDto.class.getSimpleName() + "{", "}")
        .toString();
  }
}

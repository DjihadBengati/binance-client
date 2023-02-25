package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class TrailingDeltaApiDto extends FilterApiDto {

  private Integer minTrailingAboveDelta;
  private Integer maxTrailingAboveDelta;
  private Integer minTrailingBelowDelta;
  private Integer maxTrailingBelowDelta;

  public Integer getMinTrailingAboveDelta() {
    return minTrailingAboveDelta;
  }

  public TrailingDeltaApiDto setMinTrailingAboveDelta(Integer minTrailingAboveDelta) {
    this.minTrailingAboveDelta = minTrailingAboveDelta;
    return this;
  }

  public Integer getMaxTrailingAboveDelta() {
    return maxTrailingAboveDelta;
  }

  public TrailingDeltaApiDto setMaxTrailingAboveDelta(Integer maxTrailingAboveDelta) {
    this.maxTrailingAboveDelta = maxTrailingAboveDelta;
    return this;
  }

  public Integer getMinTrailingBelowDelta() {
    return minTrailingBelowDelta;
  }

  public TrailingDeltaApiDto setMinTrailingBelowDelta(Integer minTrailingBelowDelta) {
    this.minTrailingBelowDelta = minTrailingBelowDelta;
    return this;
  }

  public Integer getMaxTrailingBelowDelta() {
    return maxTrailingBelowDelta;
  }

  public TrailingDeltaApiDto setMaxTrailingBelowDelta(Integer maxTrailingBelowDelta) {
    this.maxTrailingBelowDelta = maxTrailingBelowDelta;
    return this;
  }
}

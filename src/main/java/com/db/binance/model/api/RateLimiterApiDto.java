package com.db.binance.model.api;

public class RateLimiterApiDto {

  private RateLimitTypeApiDtoEnum rateLimitType;
  private RateLimitIntervalApiDtoEnum interval;
  private Integer intervalNum;
  private Integer limit;

  public RateLimitTypeApiDtoEnum getRateLimitType() {
    return rateLimitType;
  }

  public RateLimiterApiDto setRateLimitType(
      RateLimitTypeApiDtoEnum rateLimitType) {
    this.rateLimitType = rateLimitType;
    return this;
  }

  public RateLimitIntervalApiDtoEnum getInterval() {
    return interval;
  }

  public RateLimiterApiDto setInterval(
      RateLimitIntervalApiDtoEnum interval) {
    this.interval = interval;
    return this;
  }

  public Integer getIntervalNum() {
    return intervalNum;
  }

  public RateLimiterApiDto setIntervalNum(Integer intervalNum) {
    this.intervalNum = intervalNum;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public RateLimiterApiDto setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}

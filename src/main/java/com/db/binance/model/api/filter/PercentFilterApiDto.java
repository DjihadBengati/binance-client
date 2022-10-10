package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class PercentFilterApiDto extends FilterApiDto {

  private BigDecimal multiplierUp;
  private BigDecimal multiplierDown;
  private Integer avgPriceMins;

  public BigDecimal getMultiplierUp() {
    return multiplierUp;
  }

  public PercentFilterApiDto setMultiplierUp(BigDecimal multiplierUp) {
    this.multiplierUp = multiplierUp;
    return this;
  }

  public BigDecimal getMultiplierDown() {
    return multiplierDown;
  }

  public PercentFilterApiDto setMultiplierDown(BigDecimal multiplierDown) {
    this.multiplierDown = multiplierDown;
    return this;
  }

  public Integer getAvgPriceMins() {
    return avgPriceMins;
  }

  public PercentFilterApiDto setAvgPriceMins(Integer avgPriceMins) {
    this.avgPriceMins = avgPriceMins;
    return this;
  }
}

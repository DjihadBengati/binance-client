package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class PercentPriceBySideApiDto extends FilterApiDto {

  private BigDecimal bidMultiplierUp;
  private BigDecimal bidMultiplierDown;
  private Integer askMultiplierUp;
  private BigDecimal askMultiplierDown;
  private Integer avgPriceMins;

  public BigDecimal getBidMultiplierUp() {
    return bidMultiplierUp;
  }

  public PercentPriceBySideApiDto setBidMultiplierUp(BigDecimal bidMultiplierUp) {
    this.bidMultiplierUp = bidMultiplierUp;
    return this;
  }

  public BigDecimal getBidMultiplierDown() {
    return bidMultiplierDown;
  }

  public PercentPriceBySideApiDto setBidMultiplierDown(BigDecimal bidMultiplierDown) {
    this.bidMultiplierDown = bidMultiplierDown;
    return this;
  }

  public Integer getAskMultiplierUp() {
    return askMultiplierUp;
  }

  public PercentPriceBySideApiDto setAskMultiplierUp(Integer askMultiplierUp) {
    this.askMultiplierUp = askMultiplierUp;
    return this;
  }

  public BigDecimal getAskMultiplierDown() {
    return askMultiplierDown;
  }

  public PercentPriceBySideApiDto setAskMultiplierDown(BigDecimal askMultiplierDown) {
    this.askMultiplierDown = askMultiplierDown;
    return this;
  }

  public Integer getAvgPriceMins() {
    return avgPriceMins;
  }

  public PercentPriceBySideApiDto setAvgPriceMins(Integer avgPriceMins) {
    this.avgPriceMins = avgPriceMins;
    return this;
  }
}

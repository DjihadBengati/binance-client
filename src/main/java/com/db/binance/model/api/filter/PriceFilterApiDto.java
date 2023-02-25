package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class PriceFilterApiDto extends FilterApiDto {

  private BigDecimal minPrice;
  private BigDecimal maxPrice;
  private BigDecimal tickSize;

  public BigDecimal getMinPrice() {
    return minPrice;
  }

  public PriceFilterApiDto setMinPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  public BigDecimal getMaxPrice() {
    return maxPrice;
  }

  public PriceFilterApiDto setMaxPrice(BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  public BigDecimal getTickSize() {
    return tickSize;
  }

  public PriceFilterApiDto setTickSize(BigDecimal tickSize) {
    this.tickSize = tickSize;
    return this;
  }
}

package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class MarketLotSizeApiDto extends FilterApiDto {

  private BigDecimal minQty;
  private BigDecimal maxQty;
  private BigDecimal stepSize;

  public BigDecimal getMinQty() {
    return minQty;
  }

  public MarketLotSizeApiDto setMinQty(BigDecimal minQty) {
    this.minQty = minQty;
    return this;
  }

  public BigDecimal getMaxQty() {
    return maxQty;
  }

  public MarketLotSizeApiDto setMaxQty(BigDecimal maxQty) {
    this.maxQty = maxQty;
    return this;
  }

  public BigDecimal getStepSize() {
    return stepSize;
  }

  public MarketLotSizeApiDto setStepSize(BigDecimal stepSize) {
    this.stepSize = stepSize;
    return this;
  }
}

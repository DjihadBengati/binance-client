package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class LotSizeApiDto extends FilterApiDto {

  private BigDecimal minQty;
  private BigDecimal maxQty;
  private BigDecimal stepSize;

  public BigDecimal getMinQty() {
    return minQty;
  }

  public LotSizeApiDto setMinQty(BigDecimal minQty) {
    this.minQty = minQty;
    return this;
  }

  public BigDecimal getMaxQty() {
    return maxQty;
  }

  public LotSizeApiDto setMaxQty(BigDecimal maxQty) {
    this.maxQty = maxQty;
    return this;
  }

  public BigDecimal getStepSize() {
    return stepSize;
  }

  public LotSizeApiDto setStepSize(BigDecimal stepSize) {
    this.stepSize = stepSize;
    return this;
  }
}

package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class MaxPositionApiDto extends FilterApiDto {

  private BigDecimal maxPosition;

  public BigDecimal getMaxPosition() {
    return maxPosition;
  }

  public MaxPositionApiDto setMaxPosition(BigDecimal maxPosition) {
    this.maxPosition = maxPosition;
    return this;
  }
}

package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class MaxNumAlgoOrdersApiDto extends FilterApiDto {

  private Integer maxNumAlgoOrders;

  public Integer getMaxNumAlgoOrders() {
    return maxNumAlgoOrders;
  }

  public MaxNumAlgoOrdersApiDto setMaxNumAlgoOrders(Integer maxNumAlgoOrders) {
    this.maxNumAlgoOrders = maxNumAlgoOrders;
    return this;
  }
}

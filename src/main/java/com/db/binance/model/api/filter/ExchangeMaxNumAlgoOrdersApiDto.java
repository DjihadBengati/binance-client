package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class ExchangeMaxNumAlgoOrdersApiDto extends FilterApiDto {

  private Integer maxNumAlgoOrders;

  public Integer getMaxNumAlgoOrders() {
    return maxNumAlgoOrders;
  }

  public ExchangeMaxNumAlgoOrdersApiDto setMaxNumAlgoOrders(Integer maxNumAlgoOrders) {
    this.maxNumAlgoOrders = maxNumAlgoOrders;
    return this;
  }
}

package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class MaxNumOrdersApiDto extends FilterApiDto {

  private Integer maxNumOrders;

  public Integer getMaxNumOrders() {
    return maxNumOrders;
  }

  public MaxNumOrdersApiDto setMaxNumOrders(Integer maxNumOrders) {
    this.maxNumOrders = maxNumOrders;
    return this;
  }
}

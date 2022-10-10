package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class MaxNumIcebergOrders extends FilterApiDto {

  private Integer maxNumIcebergOrders;

  public Integer getMaxNumIcebergOrders() {
    return maxNumIcebergOrders;
  }

  public MaxNumIcebergOrders setMaxNumIcebergOrders(Integer maxNumIcebergOrders) {
    this.maxNumIcebergOrders = maxNumIcebergOrders;
    return this;
  }
}

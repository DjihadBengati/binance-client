package com.db.binance.model.api.filter;

public class ExchangeMaxNumIcebergOrdersApiDto {

  private Integer maxNumIcebergOrders;

  public Integer getMaxNumIcebergOrders() {
    return maxNumIcebergOrders;
  }

  public ExchangeMaxNumIcebergOrdersApiDto setMaxNumIcebergOrders(
      Integer maxNumIcebergOrders) {
    this.maxNumIcebergOrders = maxNumIcebergOrders;
    return this;
  }
}

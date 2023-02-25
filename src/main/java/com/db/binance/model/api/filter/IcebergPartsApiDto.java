package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;

public class IcebergPartsApiDto extends FilterApiDto {

  private Integer limit;

  public Integer getLimit() {
    return limit;
  }

  public IcebergPartsApiDto setLimit(Integer limit) {
    this.limit = limit;
    return this;
  }
}

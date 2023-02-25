package com.db.binance.model.api;

// TODO extends this class for each type of Filter
public class FilterApiDto {

  private FilterTypeApiDtoEnum filterType;

  public FilterTypeApiDtoEnum getFilterType() {
    return filterType;
  }

  public FilterApiDto setFilterType(FilterTypeApiDtoEnum filterType) {
    this.filterType = filterType;
    return this;
  }
}

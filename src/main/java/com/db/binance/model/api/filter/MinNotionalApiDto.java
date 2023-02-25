package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class MinNotionalApiDto extends FilterApiDto {

  private BigDecimal minNotional;
  private Boolean applyToMarket;
  private Integer avgPriceMins;

  public BigDecimal getMinNotional() {
    return minNotional;
  }

  public MinNotionalApiDto setMinNotional(BigDecimal minNotional) {
    this.minNotional = minNotional;
    return this;
  }

  public Boolean getApplyToMarket() {
    return applyToMarket;
  }

  public MinNotionalApiDto setApplyToMarket(Boolean applyToMarket) {
    this.applyToMarket = applyToMarket;
    return this;
  }

  public Integer getAvgPriceMins() {
    return avgPriceMins;
  }

  public MinNotionalApiDto setAvgPriceMins(Integer avgPriceMins) {
    this.avgPriceMins = avgPriceMins;
    return this;
  }
}

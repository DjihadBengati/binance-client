package com.db.binance.model.api.filter;

import com.db.binance.model.api.FilterApiDto;
import java.math.BigDecimal;

public class NotionalApiDto extends FilterApiDto {

  private BigDecimal minNotional;
  private Boolean applyMinToMarket;
  private BigDecimal maxNotional;
  private Boolean applyMaxToMarket;
  private Integer avgPriceMins;

  public BigDecimal getMinNotional() {
    return minNotional;
  }

  public NotionalApiDto setMinNotional(BigDecimal minNotional) {
    this.minNotional = minNotional;
    return this;
  }

  public Boolean getApplyMinToMarket() {
    return applyMinToMarket;
  }

  public NotionalApiDto setApplyMinToMarket(Boolean applyMinToMarket) {
    this.applyMinToMarket = applyMinToMarket;
    return this;
  }

  public BigDecimal getMaxNotional() {
    return maxNotional;
  }

  public NotionalApiDto setMaxNotional(BigDecimal maxNotional) {
    this.maxNotional = maxNotional;
    return this;
  }

  public Boolean getApplyMaxToMarket() {
    return applyMaxToMarket;
  }

  public NotionalApiDto setApplyMaxToMarket(Boolean applyMaxToMarket) {
    this.applyMaxToMarket = applyMaxToMarket;
    return this;
  }

  public Integer getAvgPriceMins() {
    return avgPriceMins;
  }

  public NotionalApiDto setAvgPriceMins(Integer avgPriceMins) {
    this.avgPriceMins = avgPriceMins;
    return this;
  }
}

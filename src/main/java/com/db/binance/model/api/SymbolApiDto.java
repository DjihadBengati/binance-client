package com.db.binance.model.api;

import java.util.Set;

public class SymbolApiDto {

  private String symbol;
  private String status;
  private String baseAsset;
  private Integer baseAssetPrecision;
  private String quoteAsset;
  private Integer quotePrecision;
  private Integer quoteAssetPrecision;
  private Set<OrderTypeApiDtoEnum> orderTypes;
  private Boolean icebergAllowed;
  private Boolean ocoAllowed;
  private Boolean quoteOrderQtyMarketAllowed;
  private Boolean allowTrailingStop;
  private Boolean cancelReplaceAllowed;
  private Boolean isSpotTradingAllowed;
  private Boolean isMarginTradingAllowed;
  // TODO add filters
  private Set<PermissionApiDtoEnum> permissions;

  public String getSymbol() {
    return symbol;
  }

  public SymbolApiDto setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public SymbolApiDto setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getBaseAsset() {
    return baseAsset;
  }

  public SymbolApiDto setBaseAsset(String baseAsset) {
    this.baseAsset = baseAsset;
    return this;
  }

  public Integer getBaseAssetPrecision() {
    return baseAssetPrecision;
  }

  public SymbolApiDto setBaseAssetPrecision(Integer baseAssetPrecision) {
    this.baseAssetPrecision = baseAssetPrecision;
    return this;
  }

  public String getQuoteAsset() {
    return quoteAsset;
  }

  public SymbolApiDto setQuoteAsset(String quoteAsset) {
    this.quoteAsset = quoteAsset;
    return this;
  }

  public Integer getQuotePrecision() {
    return quotePrecision;
  }

  public SymbolApiDto setQuotePrecision(Integer quotePrecision) {
    this.quotePrecision = quotePrecision;
    return this;
  }

  public Integer getQuoteAssetPrecision() {
    return quoteAssetPrecision;
  }

  public SymbolApiDto setQuoteAssetPrecision(Integer quoteAssetPrecision) {
    this.quoteAssetPrecision = quoteAssetPrecision;
    return this;
  }

  public Set<OrderTypeApiDtoEnum> getOrderTypes() {
    return orderTypes;
  }

  public SymbolApiDto setOrderTypes(
      Set<OrderTypeApiDtoEnum> orderTypes) {
    this.orderTypes = orderTypes;
    return this;
  }

  public Boolean getIcebergAllowed() {
    return icebergAllowed;
  }

  public SymbolApiDto setIcebergAllowed(Boolean icebergAllowed) {
    this.icebergAllowed = icebergAllowed;
    return this;
  }

  public Boolean getOcoAllowed() {
    return ocoAllowed;
  }

  public SymbolApiDto setOcoAllowed(Boolean ocoAllowed) {
    this.ocoAllowed = ocoAllowed;
    return this;
  }

  public Boolean getQuoteOrderQtyMarketAllowed() {
    return quoteOrderQtyMarketAllowed;
  }

  public SymbolApiDto setQuoteOrderQtyMarketAllowed(Boolean quoteOrderQtyMarketAllowed) {
    this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
    return this;
  }

  public Boolean getAllowTrailingStop() {
    return allowTrailingStop;
  }

  public SymbolApiDto setAllowTrailingStop(Boolean allowTrailingStop) {
    this.allowTrailingStop = allowTrailingStop;
    return this;
  }

  public Boolean getCancelReplaceAllowed() {
    return cancelReplaceAllowed;
  }

  public SymbolApiDto setCancelReplaceAllowed(Boolean cancelReplaceAllowed) {
    this.cancelReplaceAllowed = cancelReplaceAllowed;
    return this;
  }

  public Boolean getSpotTradingAllowed() {
    return isSpotTradingAllowed;
  }

  public SymbolApiDto setSpotTradingAllowed(Boolean spotTradingAllowed) {
    isSpotTradingAllowed = spotTradingAllowed;
    return this;
  }

  public Boolean getMarginTradingAllowed() {
    return isMarginTradingAllowed;
  }

  public SymbolApiDto setMarginTradingAllowed(Boolean marginTradingAllowed) {
    isMarginTradingAllowed = marginTradingAllowed;
    return this;
  }

  public Set<PermissionApiDtoEnum> getPermissions() {
    return permissions;
  }

  public SymbolApiDto setPermissions(
      Set<PermissionApiDtoEnum> permissions) {
    this.permissions = permissions;
    return this;
  }
}

package com.db.binance.model.resource.api;

public class SymbolDto {

  private String symbol;
  private String status;


  public String getSymbol() {
    return symbol;
  }

  public SymbolDto setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public SymbolDto setStatus(String status) {
    this.status = status;
    return this;
  }
}

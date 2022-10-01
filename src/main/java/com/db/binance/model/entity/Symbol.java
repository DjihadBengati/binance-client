package com.db.binance.model.entity;

public class Symbol {

  private String name;
  private String status;


  public String getName() {
    return name;
  }

  public Symbol setName(String name) {
    this.name = name;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public Symbol setStatus(String status) {
    this.status = status;
    return this;
  }
}

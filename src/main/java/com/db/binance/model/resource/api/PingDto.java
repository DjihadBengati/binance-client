package com.db.binance.model.resource.api;

public class PingDto {

  private boolean up;

  public boolean isUp() {
    return up;
  }

  public PingDto setUp(boolean up) {
    this.up = up;
    return this;
  }
}

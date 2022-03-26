package com.db.binance.model.entity.wallet;

import java.util.StringJoiner;

public class SystemStatus {

  private Integer status;

  private String msg;

  public Integer getStatus() {
    return status;
  }

  public SystemStatus setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getMsg() {
    return msg;
  }

  public SystemStatus setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", SystemStatus.class.getSimpleName() + "[", "]")
        .add("status=" + status)
        .add("msg='" + msg + "'")
        .toString();
  }
}

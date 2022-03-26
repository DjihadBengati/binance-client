package com.db.binance.model.resource.wallet;

import java.util.StringJoiner;

public class SystemStatusDto {

  private Integer status;

  private String msg;

  public Integer getStatus() {
    return status;
  }

  public SystemStatusDto setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getMsg() {
    return msg;
  }

  public SystemStatusDto setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", SystemStatusDto.class.getSimpleName() + "[", "]")
        .add("status=" + status)
        .add("msg='" + msg + "'")
        .toString();
  }
}

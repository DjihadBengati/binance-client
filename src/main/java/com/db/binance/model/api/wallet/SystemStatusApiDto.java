package com.db.binance.model.api.wallet;

import java.util.StringJoiner;

public class SystemStatusApiDto {

  private Integer status;

  private String msg;

  public Integer getStatus() {
    return status;
  }

  public SystemStatusApiDto setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public String getMsg() {
    return msg;
  }

  public SystemStatusApiDto setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", SystemStatusApiDto.class.getSimpleName() + "[", "]")
        .add("status=" + status)
        .add("msg='" + msg + "'")
        .toString();
  }
}

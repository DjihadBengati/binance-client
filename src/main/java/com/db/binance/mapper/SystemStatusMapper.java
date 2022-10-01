package com.db.binance.mapper;

import com.db.binance.model.api.wallet.SystemStatusApiDto;
import com.db.binance.model.entity.wallet.SystemStatus;
import com.db.binance.model.resource.wallet.WalletSystemStatusDto;

public final class SystemStatusMapper {

  private SystemStatusMapper() {
    throw new IllegalStateException("Mapper class");
  }

  public static SystemStatus map(SystemStatusApiDto apiDto) {
    return new SystemStatus().setMsg(apiDto.getMsg()).setStatus(apiDto.getStatus());
  }

  public static WalletSystemStatusDto map(SystemStatus entity) {
    return new WalletSystemStatusDto().setMsg(entity.getMsg()).setStatus(entity.getStatus());
  }
}

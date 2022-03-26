package com.db.binance.mapper;

import com.db.binance.model.api.wallet.SystemStatusApiDto;
import com.db.binance.model.entity.wallet.SystemStatus;
import com.db.binance.model.resource.wallet.SystemStatusDto;

public final class SystemStatusMapper {

  public static SystemStatus map(SystemStatusApiDto apiDto) {
    return new SystemStatus().setMsg(apiDto.getMsg()).setStatus(apiDto.getStatus());
  }

  public static SystemStatusDto map(SystemStatus entity) {
    return new SystemStatusDto().setMsg(entity.getMsg()).setStatus(entity.getStatus());
  }
}

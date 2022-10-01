package com.db.binance.mapper;

import static com.db.binance.mapper.SystemStatusMapper.map;
import static org.assertj.core.api.Assertions.assertThat;

import com.db.binance.model.api.wallet.SystemStatusApiDto;
import com.db.binance.model.entity.wallet.SystemStatus;
import com.db.binance.model.resource.wallet.WalletSystemStatusDto;
import org.junit.jupiter.api.Test;

class SystemStatusMapperTest {

  @Test
  void should_map_fullResource() {
    SystemStatus entity = new SystemStatus().setMsg("normal").setStatus(0);
    WalletSystemStatusDto resource = new WalletSystemStatusDto().setMsg("normal").setStatus(0);
    assertThat(map(entity)).usingRecursiveComparison().isEqualTo(resource);
  }

  @Test
  void should_map_emptyResource() {
    SystemStatus entity = new SystemStatus();
    WalletSystemStatusDto resource = new WalletSystemStatusDto();
    assertThat(map(entity)).usingRecursiveComparison().isEqualTo(resource);
  }

  @Test
  void should_map_emptyMsgResource() {
    SystemStatus entity = new SystemStatus().setStatus(0);
    WalletSystemStatusDto resource = new WalletSystemStatusDto().setStatus(0);
    assertThat(map(entity)).usingRecursiveComparison().isEqualTo(resource);
  }

  @Test
  void should_map_emptyStatusResource() {
    SystemStatus entity = new SystemStatus().setMsg("normal");
    WalletSystemStatusDto resource = new WalletSystemStatusDto().setMsg("normal");
    assertThat(map(entity)).usingRecursiveComparison().isEqualTo(resource);
  }

  @Test
  void should_map_fullApiDto() {
    SystemStatusApiDto apiDto = new SystemStatusApiDto().setMsg("normal").setStatus(0);
    SystemStatus entity = new SystemStatus().setMsg("normal").setStatus(0);
    assertThat(map(apiDto)).usingRecursiveComparison().isEqualTo(entity);
  }

  @Test
  void should_map_emptyApiDto() {
    SystemStatusApiDto apiDto = new SystemStatusApiDto();
    SystemStatus entity = new SystemStatus();
    assertThat(map(apiDto)).usingRecursiveComparison().isEqualTo(entity);
  }

  @Test
  void should_map_emptyMsgApiDto() {
    SystemStatusApiDto apiDto = new SystemStatusApiDto().setStatus(0);
    SystemStatus entity = new SystemStatus().setStatus(0);
    assertThat(map(apiDto)).usingRecursiveComparison().isEqualTo(entity);
  }

  @Test
  void should_map_emptyStatusApiDto() {
    SystemStatusApiDto apiDto = new SystemStatusApiDto().setMsg("normal");
    SystemStatus entity = new SystemStatus().setMsg("normal");
    assertThat(map(apiDto)).usingRecursiveComparison().isEqualTo(entity);
  }
}

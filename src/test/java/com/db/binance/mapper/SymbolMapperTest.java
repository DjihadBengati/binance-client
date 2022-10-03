package com.db.binance.mapper;

import static com.db.binance.mapper.SymbolMapper.map;
import static com.db.binance.utils.data.ExchangeInfoData.fullSymbol;
import static com.db.binance.utils.data.ExchangeInfoData.fullSymbolDto;
import static org.assertj.core.api.Assertions.assertThat;

import com.db.binance.model.entity.Symbol;
import com.db.binance.model.resource.api.SymbolDto;
import org.junit.jupiter.api.Test;

class SymbolMapperTest {

  @Test
  void symbolMapper_shouldMapDto() {
    Symbol entity = fullSymbol();
    SymbolDto expected = fullSymbolDto();
    SymbolDto result = map(entity);
    assertThat(result).isNotNull();
    assertThat(result.getSymbol()).isNotNull();
    assertThat(result.getSymbol()).isEqualTo(expected.getSymbol());
    assertThat(result.getStatus()).isNotNull();
    assertThat(result.getStatus()).isEqualTo(expected.getStatus());
  }

  @Test
  void symbolMapper_shouldMapApiDto() {
    // TODO
  }
}

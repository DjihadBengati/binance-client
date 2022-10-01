package com.db.binance.mapper;

import com.db.binance.model.api.SymbolApiDto;
import com.db.binance.model.entity.Symbol;
import com.db.binance.model.resource.api.SymbolDto;
import java.util.List;
import java.util.stream.Collectors;

public final class SymbolMapper {

  private SymbolMapper() {
    throw new IllegalStateException("Mapper class");
  }

  public static SymbolDto map(Symbol entity) {
    return new SymbolDto().setSymbol(entity.getName())
        .setStatus(entity.getStatus());
  }

  public static List<SymbolDto> mapEntities(List<Symbol> entities) {
    return entities.stream().map(SymbolMapper::map).collect(Collectors.toList());
  }

  public static Symbol map(SymbolApiDto apiDto) {
    return new Symbol().setName(apiDto.getSymbol())
        .setStatus(apiDto.getStatus());
  }

  public static List<Symbol> map(List<SymbolApiDto> apiDtos) {
    return apiDtos.stream().map(SymbolMapper::map).collect(Collectors.toList());
  }
}

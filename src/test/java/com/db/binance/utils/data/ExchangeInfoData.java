package com.db.binance.utils.data;

import static com.db.binance.model.api.OrderTypeApiDtoEnum.LIMIT;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.LIMIT_MAKER;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.MARKET;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.STOP_LOSS;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.STOP_LOSS_LIMIT;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.TAKE_PROFIT;
import static com.db.binance.model.api.OrderTypeApiDtoEnum.TAKE_PROFIT_LIMIT;
import static com.db.binance.model.api.PermissionApiDtoEnum.LEVERAGED;
import static com.db.binance.model.api.PermissionApiDtoEnum.MARGIN;
import static com.db.binance.model.api.PermissionApiDtoEnum.SPOT;
import static com.db.binance.model.api.PermissionApiDtoEnum.TRD_GRP_002;
import static com.db.binance.model.api.PermissionApiDtoEnum.TRD_GRP_003;
import static com.db.binance.model.api.PermissionApiDtoEnum.TRD_GRP_004;
import static com.db.binance.model.api.PermissionApiDtoEnum.TRD_GRP_005;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.List.of;

import com.db.binance.model.api.ExchangeInfoApiDto;
import com.db.binance.model.api.OrderTypeApiDtoEnum;
import com.db.binance.model.api.PermissionApiDtoEnum;
import com.db.binance.model.api.SymbolApiDto;
import com.db.binance.model.entity.ExchangeInfo;
import com.db.binance.model.entity.Symbol;
import com.db.binance.model.resource.api.ExchangeInfoDto;
import com.db.binance.model.resource.api.SymbolDto;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public final class ExchangeInfoData {

  public static final String TIMEZONE_UTC = "UTC";
  public static final Long TIMEZONE_TIMESTAMP = 1565246363776L;
  public static final LocalDateTime SERVER_TIME = new Timestamp(TIMEZONE_TIMESTAMP)
      .toLocalDateTime();
  public static final String SYMBOL_NAME = "ETHBTC";
  public static final String SYMBOL_STATUS = "TRADING";
  public static final String SYMBOL_BASE_ASSET = "ETH";
  public static final String SYMBOL_QUOTE_ASSET = "BTC";
  public static final int SYMBOL_BASE_ASSET_PRECISION = 8;
  public static final int SYMBOL_QUOTE_PRECISION = 8;
  public static final int SYMBOL_QUOTE_ASSET_PRECISION = 8;

  public static final Set<OrderTypeApiDtoEnum> SYMBOL_ORDER_TYPES = Set.of(LIMIT,
      LIMIT_MAKER,
      MARKET,
      STOP_LOSS,
      STOP_LOSS_LIMIT,
      TAKE_PROFIT,
      TAKE_PROFIT_LIMIT);

  public static final Boolean SYMBOL_ICEBERG_ALLOWED = TRUE;
  public static final Boolean SYMBOL_OCO_ALLOWED = TRUE;
  public static final Boolean SYMBOL_QUOTE_ORDER_QTY_MARKET_ALLOWED = FALSE;
  public static final Boolean SYMBOL_ALLOW_TRAILING_STOP = FALSE;
  public static final Boolean SYMBOL_CANCEL_REPLACE_ALLOWED = FALSE;
  public static final Boolean SYMBOL_IS_SPOT_TRADING_ALLOWED = TRUE;
  public static final Boolean SYMBOL_IS_MARGIN_TRADING_ALLOWED = TRUE;
  public static final Set<PermissionApiDtoEnum> SYMBOL_PERMISSIONS = Set.of(SPOT,
      MARGIN,
      LEVERAGED,
      TRD_GRP_002,
      TRD_GRP_003,
      TRD_GRP_004,
      TRD_GRP_005);

  public static ExchangeInfoApiDto fullExchangeApiDto() {
    return new ExchangeInfoApiDto().setTimezone(TIMEZONE_UTC)
        .setServerTime(TIMEZONE_TIMESTAMP)
        // TODO add rate limits
        // TODO exchange filters
        .setSymbols(List.of(fullSymbolApiDto()));
  }

  public static ExchangeInfo fullExchangeInfo() {
    return new ExchangeInfo().setTimezone(TIMEZONE_UTC)
        .setServerTime(SERVER_TIME)
        .setSymbols(of(fullSymbol()));
  }

  public static ExchangeInfoDto fullExchangeInfoDto() {
    return new ExchangeInfoDto().setTimezone(TIMEZONE_UTC)
        .setServerTime(SERVER_TIME)
        .setSymbols(of(fullSymbolDto()));
  }

  public static Symbol fullSymbol() {
    return new Symbol().setName(SYMBOL_NAME).setStatus(SYMBOL_STATUS);
  }

  public static SymbolDto fullSymbolDto() {
    return new SymbolDto().setSymbol(SYMBOL_NAME).setStatus(SYMBOL_STATUS);
  }

  public static SymbolApiDto fullSymbolApiDto() {
    return new SymbolApiDto().setSymbol(SYMBOL_NAME)
        .setStatus(SYMBOL_STATUS)
        .setBaseAsset(SYMBOL_BASE_ASSET)
        .setBaseAssetPrecision(SYMBOL_BASE_ASSET_PRECISION)
        .setQuoteAsset(SYMBOL_QUOTE_ASSET)
        .setQuotePrecision(SYMBOL_QUOTE_PRECISION)
        .setQuoteAssetPrecision(SYMBOL_QUOTE_ASSET_PRECISION)
        .setOrderTypes(SYMBOL_ORDER_TYPES)
        .setIcebergAllowed(SYMBOL_ICEBERG_ALLOWED)
        .setOcoAllowed(SYMBOL_OCO_ALLOWED)
        .setQuoteOrderQtyMarketAllowed(SYMBOL_QUOTE_ORDER_QTY_MARKET_ALLOWED)
        .setAllowTrailingStop(SYMBOL_ALLOW_TRAILING_STOP)
        .setCancelReplaceAllowed(SYMBOL_CANCEL_REPLACE_ALLOWED)
        .setSpotTradingAllowed(SYMBOL_IS_SPOT_TRADING_ALLOWED)
        .setMarginTradingAllowed(SYMBOL_IS_MARGIN_TRADING_ALLOWED)
        // TODO set filters
        .setPermissions(SYMBOL_PERMISSIONS);
  }
}

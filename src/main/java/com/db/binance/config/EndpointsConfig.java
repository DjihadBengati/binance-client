package com.db.binance.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "default.endpoints")
public class EndpointsConfig {

  private String binanceUrl;

  public String getBinanceUrl() {
    return binanceUrl;
  }

  public EndpointsConfig setBinanceUrl(String binanceUrl) {
    this.binanceUrl = binanceUrl;
    return this;
  }
}

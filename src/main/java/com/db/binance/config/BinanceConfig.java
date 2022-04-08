package com.db.binance.config;

import javax.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "binance")
public class BinanceConfig {

  @NotBlank
  private String url;

  private String apiKey;

  private String apiSecret;

  public String getUrl() {
    return url;
  }

  public BinanceConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getApiKey() {
    return apiKey;
  }

  public BinanceConfig setApiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public String getApiSecret() {
    return apiSecret;
  }

  public BinanceConfig setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }

}

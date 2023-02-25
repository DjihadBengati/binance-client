package com.db.binance.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootTest(webEnvironment = DEFINED_PORT)
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
@AutoConfigureWireMock(port = 9999)
class BinanceConfigTest {

  private final String URL = "http://localhost:9999";
  private final String API_KEY = "XXXXXXXXXX";
  private final String API_SECRET = "YYYYYYYYYY";

  @Autowired
  private BinanceConfig binanceConfig;

  @BeforeEach
  void before() {
    binanceConfig.setUrl(URL);
    binanceConfig.setApiKey(API_KEY);
    binanceConfig.setApiSecret(API_SECRET);
  }

  @Test
  void shouldLoadConfig() {
    assertThat(binanceConfig).isNotNull();
    assertThat(binanceConfig.getUrl()).isNotNull();
    assertThat(binanceConfig.getUrl()).isEqualTo(URL);
    assertThat(binanceConfig.getApiKey()).isNotNull();
    assertThat(binanceConfig.getApiKey()).isEqualTo(API_KEY);
    assertThat(binanceConfig.getApiSecret()).isNotNull();
    assertThat(binanceConfig.getApiSecret()).isEqualTo(API_SECRET);
  }
}

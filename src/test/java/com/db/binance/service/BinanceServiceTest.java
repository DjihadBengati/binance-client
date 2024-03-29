package com.db.binance.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest(webEnvironment = DEFINED_PORT)
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
@AutoConfigureWireMock(port = 9999)
class BinanceServiceTest {

  @Autowired
  private BinanceService service;

  @Test
  @DisplayName("Should get Binance API ping")
  void apiPing_shouldSucceed() {
    Mono<Boolean> apiPing = service.apiPing();
    StepVerifier
        .create(apiPing)
        .consumeNextWith(ping -> {
          assertThat(ping).isNotNull();
          assertThat(ping).isTrue();
        })
        .verifyComplete();
  }
}

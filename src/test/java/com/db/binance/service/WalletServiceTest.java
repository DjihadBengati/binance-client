package com.db.binance.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import com.db.binance.model.entity.wallet.SystemStatus;
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
class WalletServiceTest {

  @Autowired
  private WalletService service;

  @Test
  @DisplayName("Should get wallet system status")
  void systemStatus_shouldSucceed() {
    Mono<SystemStatus> systemStatus = service.systemStatus();
    StepVerifier
        .create(systemStatus)
        .consumeNextWith(status -> {
          assertThat(status).isNotNull();
          assertThat(status.getMsg()).isNotEmpty();
          assertThat(status.getMsg()).isEqualTo("normal");
          assertThat(status.getStatus()).isNotNull();
          assertThat(status.getStatus()).isEqualTo(0);
        })
        .verifyComplete();
  }
}
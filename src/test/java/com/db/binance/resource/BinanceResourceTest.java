package com.db.binance.resource;

import static com.db.binance.resource.ResourceConstants.API_V1;
import static com.db.binance.resource.ResourceConstants.PING;
import static com.db.binance.resource.ResourceConstants.WALLET_STATUS;
import static com.db.binance.utils.doc.ApiDoc.apiPingDoc;
import static com.db.binance.utils.doc.WalletDoc.walletStatusDoc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

import com.db.binance.model.resource.api.PingDto;
import com.db.binance.model.resource.wallet.WalletSystemStatusDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = DEFINED_PORT)
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
@AutoConfigureWireMock(port = 9999)
@AutoConfigureRestDocs
class BinanceResourceTest {

  @Autowired
  private WebTestClient webTestClient;

  @Test
  @DisplayName("Should get Binance API ping")
  void apiPing_shouldSucceed() {
    webTestClient.get().uri(API_V1 + PING)
        .exchange()
        .expectStatus().isOk()
        .expectBody(PingDto.class)
        .consumeWith(r -> {
          PingDto ping = r.getResponseBody();
          assertThat(ping).isNotNull();
          assertThat(ping.isUp()).isTrue();
        })
        .consumeWith(apiPingDoc());
  }

  @Test
  @DisplayName("Should get wallet system status")
  void walletSystemStatus_shouldSucceed() {
    webTestClient.get().uri(API_V1 + WALLET_STATUS)
        .exchange()
        .expectStatus().isOk()
        .expectBody(WalletSystemStatusDto.class)
        .consumeWith(r -> {
          WalletSystemStatusDto result = r.getResponseBody();
          assertThat(r).isNotNull();
          assertThat(result).isNotNull();
          assertThat(result.getMsg()).isNotEmpty();
          assertThat(result.getMsg()).isEqualTo("normal");
          assertThat(result.getStatus()).isNotNull();
          assertThat(result.getStatus()).isZero();
        })
        .consumeWith(walletStatusDoc());
  }

}

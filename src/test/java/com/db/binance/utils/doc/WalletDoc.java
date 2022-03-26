package com.db.binance.utils.doc;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.document;

import java.util.function.Consumer;
import org.springframework.test.web.reactive.server.ExchangeResult;

public final class WalletDoc {

  public static <T extends ExchangeResult> Consumer<T> walletStatusDoc() {
    return document("WalletStatus",
        responseFields(
            fieldWithPath("msg").description("\"normal\" or \"system_maintenance\""),
            fieldWithPath("status").description("0: normal or 1：system maintenance")));
  }
}

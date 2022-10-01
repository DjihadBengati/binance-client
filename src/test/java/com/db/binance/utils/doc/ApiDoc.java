package com.db.binance.utils.doc;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.document;

import java.util.function.Consumer;
import org.springframework.test.web.reactive.server.ExchangeResult;

public final class ApiDoc {

  public static <T extends ExchangeResult> Consumer<T> apiPingDoc() {
    return document("ApiPing",
        responseFields(
            fieldWithPath("up").description("\"true\" or \"false\"")));
  }
}

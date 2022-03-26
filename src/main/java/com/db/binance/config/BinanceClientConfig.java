package com.db.binance.config;

import com.db.binance.client.BinanceClient;
import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class BinanceClientConfig {

  private final EndpointsConfig endpointsConfig;

  public BinanceClientConfig(EndpointsConfig endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
  }

  @Bean
  public BinanceClient binanceClient() {
    Retrofit retrofit = new Retrofit.Builder().baseUrl(endpointsConfig.getBinanceUrl())
        .addCallAdapterFactory(ReactorCallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(BinanceClient.class);
  }
}

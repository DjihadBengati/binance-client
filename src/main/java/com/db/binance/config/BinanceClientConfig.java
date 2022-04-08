package com.db.binance.config;

import static com.db.binance.config.BinanceConstants.BINANCE_API_KEY;

import com.db.binance.client.BinanceClient;
import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class BinanceClientConfig {

  private final BinanceConfig endpointsConfig;

  public BinanceClientConfig(BinanceConfig endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
  }

  @Bean
  public BinanceClient binanceClient() {
    OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder();
    httpClient.networkInterceptors().add(chain -> {
      Request.Builder requestBuilder = chain.request().newBuilder();
      requestBuilder.header(BINANCE_API_KEY, endpointsConfig.getApiKey());
      return chain.proceed(requestBuilder.build());
    });
    Retrofit retrofit = new Retrofit.Builder().baseUrl(endpointsConfig.getUrl())
        .client(httpClient.build())
        .addCallAdapterFactory(ReactorCallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(BinanceClient.class);
  }
}

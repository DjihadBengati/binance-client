# Binance client
A Binance client starter pack based on [Binance API](https://binance-docs.github.io/apidocs/#change-log).

## 1. Binance client configuration
Please add the following variables to your system:
|Variables|Description|
|---|---|
|BINANCE_API_KEY|The Binance API Key|
|BINANCE_API_SECRET|The Binance API Secret|
To generate them check this [link](https://www.binance.com/fr/support/faq/360002502072).

## 2. Technical stack
* [Maven](https://maven.apache.org/)
* [SpringBoot](https://spring.io/projects/spring-boot)
* [WebFlux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
* [Retrofit](https://square.github.io/retrofit/)
* [Wiremock](https://wiremock.org/)

## 3. Run the client
`mvn install` <br />
`mvn spring-boot:run`

## 4. Test the client
`mvn test`
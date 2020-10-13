package com.kodilla.exchangesystemfront.restapi.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class RestApiConfig {

    @Value("${api.endpoint.prod}")
    private String apiKey;

    @Value("${api.endpoint.currency}")
    private String currencyEndpoint;

    @Value("${api.endpoint.cryptocurrency}")
    private String cryptoCurrencyEndpoint;
}

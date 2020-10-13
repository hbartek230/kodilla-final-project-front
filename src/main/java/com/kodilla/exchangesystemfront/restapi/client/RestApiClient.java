package com.kodilla.exchangesystemfront.restapi.client;

import com.kodilla.exchangesystemfront.domain.dto.CryptoCurrencyDto;
import com.kodilla.exchangesystemfront.domain.dto.CurrencyDto;
import com.kodilla.exchangesystemfront.restapi.config.RestApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class RestApiClient {

    private final RestTemplate restTemplate;
    private final RestApiConfig config;
    private final String apiEndpoint;

    @Autowired
    public RestApiClient(RestTemplate restTemplate, RestApiConfig config) {
        this.restTemplate = restTemplate;
        this.config = config;
        this.apiEndpoint = config.getApiKey();
    }

    public List<CurrencyDto> getCurrenciesValue() {
        URI url = UriComponentsBuilder.fromHttpUrl(apiEndpoint + config.getCurrencyEndpoint())
                .build().encode().toUri();

        try{
            CurrencyDto[] apiResponse = restTemplate.getForObject(url, CurrencyDto[].class);
            CurrencyDto[] answer = Optional.ofNullable(apiResponse).orElse(new CurrencyDto[0]);
            return Arrays.asList(answer);
        } catch (RestClientException e) {
            return new ArrayList<>();
        }
    }

    public List<CryptoCurrencyDto> getCryptoCurrencyValue() {
        URI url = UriComponentsBuilder.fromHttpUrl(apiEndpoint + config.getCryptoCurrencyEndpoint())
                .build().encode().toUri();

        try{
            CryptoCurrencyDto[] apiResponse = restTemplate.getForObject(url, CryptoCurrencyDto[].class);
            CryptoCurrencyDto[] answer = Optional.ofNullable(apiResponse).orElse(new CryptoCurrencyDto[0]);
            return Arrays.asList(answer);
        } catch (RestClientException e) {
            return new ArrayList<>();
        }
    }

}

package com.kodilla.exchangesystemfront.domain.cryptocurrency;

import com.kodilla.exchangesystemfront.restapi.client.RestApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CryptoCurrencyService {

    @Autowired
    private RestApiClient client;

    private CryptoCurrency cryptoCurrency;

    private static CryptoCurrencyService service;

    public static CryptoCurrencyService getInstance() {
        if (service == null) {
            service = new CryptoCurrencyService();
        }
        return service;
    }

    public CryptoCurrency getCryptoCurrency() {
        return exampleData();
    }

    private CryptoCurrency exampleData() {
        return new CryptoCurrency("BitCoin", "11542.12");
    }

}

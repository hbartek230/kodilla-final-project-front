package com.kodilla.exchangesystemfront.domain.currency;

import com.kodilla.exchangesystemfront.mapper.CurrencyMapper;
import com.kodilla.exchangesystemfront.restapi.client.RestApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyService {

    @Autowired
    private RestApiClient client;

    @Autowired
    private CurrencyMapper mapper;

    private List<Currency> currencies;
    private static CurrencyService service;

    public static CurrencyService getInstance() {
        if (service == null) {
            service = new CurrencyService();
        }
        return service;
    }

    public List<Currency> getCurrencies() {
        return exampleData();//mapper.mapToCurrency(client.getCurrenciesValue());
    }

    public void addCurrency(Currency currency) {
        this.currencies.add(currency);
    }

    private List<Currency> exampleData() {
        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("Dolar", "USD", "3.85", "3,92"));
        currencies.add(new Currency("Euro", "EUR", "4.48", "4.52"));
        currencies.add(new Currency("Frank szwajcarski", "CHF", "4.12", "4.17"));
        currencies.add(new Currency("Funt brytyjski", "GBP", "4.90", "4.98"));
        return currencies;
    }
}

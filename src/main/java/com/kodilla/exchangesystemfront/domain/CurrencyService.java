package com.kodilla.exchangesystemfront.domain;

import java.util.HashSet;
import java.util.Set;

public class CurrencyService {
    private Set<Currency> currencies;
    private static CurrencyService service;

    private CurrencyService() {
        this.currencies = exampleData();
    }

    public static CurrencyService getInstance() {
        if (service == null) {
            service = new CurrencyService();
        }
        return service;
    }

    public Set<Currency> getCurrencies() {
        return new HashSet<>(currencies);
    }

    public void addCurrency(Currency currency) {
        this.currencies.add(currency);
    }

    private Set<Currency> exampleData() {
        Set<Currency> currencies = new HashSet<>();
        currencies.add(new Currency("Dolar", "USD", "3.85", "3,92"));
        currencies.add(new Currency("Euro", "EUR", "4.48", "4.52"));
        currencies.add(new Currency("Frank szwajcarski", "CHF", "4.12", "4.17"));
        currencies.add(new Currency("Funt brytyjski", "GBP", "4.90", "4.98"));
        return currencies;
    }
}

package com.kodilla.exchangesystemfront.domain.cryptocurrency;

import java.util.Objects;

public class CryptoCurrency {

    private String currencyName;
    private String currencyValue;

    public CryptoCurrency(String currencyName, String currencyValue) {
        this.currencyName = currencyName;
        this.currencyValue = currencyValue;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CryptoCurrency that = (CryptoCurrency) o;
        return currencyName.equals(that.currencyName) &&
                currencyValue.equals(that.currencyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyName, currencyValue);
    }
}

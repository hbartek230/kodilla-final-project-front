package com.kodilla.exchangesystemfront.domain;

import java.util.Objects;

public class Currency {
    private String currencyName;
    private String currencyCode;
    private String currencyBid;
    private String currencyAsk;

    public Currency(String currencyName, String currencyCode, String currencyBid, String currencyAsk) {
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
        this.currencyBid = currencyBid;
        this.currencyAsk = currencyAsk;
    }

    public Currency() {
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyBid() {
        return currencyBid;
    }

    public void setCurrencyBid(String currencyBid) {
        this.currencyBid = currencyBid;
    }

    public String getCurrencyAsk() {
        return currencyAsk;
    }

    public void setCurrencyAsk(String currencyAsk) {
        this.currencyAsk = currencyAsk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return currencyName.equals(currency.currencyName) &&
                currencyCode.equals(currency.currencyCode) &&
                currencyBid.equals(currency.currencyBid) &&
                currencyAsk.equals(currency.currencyAsk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyName, currencyCode, currencyBid, currencyAsk);
    }
}

package com.kodilla.exchangesystemfront.mapper;

import com.kodilla.exchangesystemfront.domain.currency.Currency;
import com.kodilla.exchangesystemfront.domain.dto.CurrencyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CurrencyMapper {

    public List<Currency> mapToCurrency(List<CurrencyDto> currencyDtoList) {
        return currencyDtoList.stream().map(currencyDto -> new Currency(
                currencyDto.getCurrencyName(),
                currencyDto.getCurrencyCode(),
                currencyDto.getRates().get(0).getRatesBid(),
                currencyDto.getRates().get(0).getRatesAsk()))
                .collect(Collectors.toList());
    }
}

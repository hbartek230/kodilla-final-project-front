package com.kodilla.exchangesystemfront.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyDto {

    @JsonProperty("currencyName")
    private String currencyName;

    @JsonProperty("currencyCode")
    private String currencyCode;

    @JsonProperty("currencyRate")
    private List<CurrencyRateDto> rates;

}

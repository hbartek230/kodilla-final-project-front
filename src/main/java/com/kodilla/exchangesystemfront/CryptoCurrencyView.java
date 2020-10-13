package com.kodilla.exchangesystemfront;

import com.kodilla.exchangesystemfront.domain.cryptocurrency.CryptoCurrency;
import com.kodilla.exchangesystemfront.domain.cryptocurrency.CryptoCurrencyService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/second")
public class CryptoCurrencyView extends VerticalLayout {

    private CryptoCurrencyService currencyService = CryptoCurrencyService.getInstance();
    private Grid<CryptoCurrency> grid = new Grid<>(CryptoCurrency.class);

    public CryptoCurrencyView() {
        grid.setColumns("currencyName", "currencyCode", "currencyBid", "currencyAsk");
        add(grid);
        setSizeFull();
        refresh();
    }

    private void refresh() {
        grid.setItems(currencyService.getCryptoCurrency());
    }
}

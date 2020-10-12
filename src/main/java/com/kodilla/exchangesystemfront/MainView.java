package com.kodilla.exchangesystemfront;

import com.kodilla.exchangesystemfront.domain.Currency;
import com.kodilla.exchangesystemfront.domain.CurrencyService;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route
public class MainView extends VerticalLayout {

    private CurrencyService currencyService = CurrencyService.getInstance();
    private Grid<Currency> grid = new Grid<>(Currency.class);

    public MainView() {
        grid.setColumns("currencyName", "currencyCode", "currencyBid", "currencyAsk");
        prepareMenu();
        add(grid);
        setSizeFull();
        refresh();
    }

    private void prepareMenu() {
        MenuBar menuBar = new MenuBar();
        MenuItem currencies = menuBar.addItem("Waluty");
        MenuItem cryptoCurrencies = menuBar.addItem("Kryptowaluty");
        MenuItem transactions = menuBar.addItem("Twoje transakcje");
        MenuItem userAccount = menuBar.addItem("Konto");
        currencies.addClickListener(e -> new RouterLink("Test", SecondView.class));
        add(menuBar);
    }

    private void refresh() {
        grid.setItems(currencyService.getCurrencies());
    }
}

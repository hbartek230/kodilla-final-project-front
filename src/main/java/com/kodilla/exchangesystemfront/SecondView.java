package com.kodilla.exchangesystemfront;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/second")
public class SecondView extends VerticalLayout {

    public SecondView() {
        add(new Button("Click me", event -> Notification.show("Clicked")));
    }
}

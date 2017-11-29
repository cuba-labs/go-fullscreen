package com.company.fullscreen.web.screens;

import com.company.fullscreen.web.ext.GoFullScreenClickExtension;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Button;

import javax.inject.Inject;
import java.util.Map;

public class DemoScreen extends AbstractWindow {
    @Inject
    private Button goFullScreenBtn;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        com.vaadin.ui.Component vComponent = unwrap(com.vaadin.ui.Component.class);
        vComponent.setId("fullScreenContent");

        com.vaadin.ui.Button vButton =
                goFullScreenBtn.unwrap(com.vaadin.ui.Button.class);

        // create client-side extension and add it to button
        // because we want to handle click in JS
        new GoFullScreenClickExtension().extend(vButton, vComponent.getId());
    }
}
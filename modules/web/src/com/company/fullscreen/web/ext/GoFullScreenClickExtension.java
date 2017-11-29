package com.company.fullscreen.web.ext;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.Button;

@JavaScript("vaadin://go-fullscreen.js")
public class GoFullScreenClickExtension extends AbstractJavaScriptExtension {

    public void extend(Button target, String elementId) {
        super.extend(target);

        callFunction("init", elementId);
    }
}
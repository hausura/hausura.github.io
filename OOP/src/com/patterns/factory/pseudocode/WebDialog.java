package com.patterns.factory.pseudocode;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HTMLButton();
    }
}

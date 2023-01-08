package com.patterns.abstractFactory.pseudocode;

public class WindowsFactory implements GUIFactory{

    public WindowsFactory() {
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

}

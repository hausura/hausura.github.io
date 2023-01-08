package com.patterns.abstractFactory.pseudocode;

public class WinButton implements Button{
    public WinButton() {
    }

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

package com.patterns.decorator.ex2;

public class NutsToppingDecorator extends ToppingDecorator {
    IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+addTopping();
    }

    @Override
    public String addTopping() {
        return "Nuts";
    }
}
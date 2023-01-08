package com.patterns.decorator.ex2;

public class HoneyToppingDecorator extends ToppingDecorator{
    IceCream iceCream;
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+addTopping();
    }

    @Override
    public String addTopping() {
        return "Honey";
    }
}

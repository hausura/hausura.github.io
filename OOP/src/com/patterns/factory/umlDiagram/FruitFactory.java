package com.patterns.factory.umlDiagram;

public class FruitFactory {
    public Fruit provideFruit(String fruit) throws Exception{
        if (fruit.equals("Apple")) {
            return new Apple();
        }
        if (fruit.equals("Banana")) {
            return new Banana();
        }
        if (fruit.equals("Orange")) {
            return new Orange();
        }
        else throw new Exception("Error");
    }
}

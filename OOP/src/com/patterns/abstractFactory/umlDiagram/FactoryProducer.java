package com.patterns.abstractFactory.umlDiagram;

public class FactoryProducer {
    AbstractFactory getFactory(String service){
        if (service.equals("RoundedShapeFactory")) {
            return new RoundedShapeFactory();
        }
        else if (service.equals("ShapeFactory")) {
            return new ShapeFactory();
        }
        return null;
    }
}

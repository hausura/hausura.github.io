package com.patterns.abstractFactory.umlDiagram;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) throws Exception {
        String request1 = "ShapeFactory";
        String request2 = "RoundedShapeFactory";
        FactoryProducer service = new FactoryProducer();
        service.getFactory(request1).getShape("Square").draw();

        service.getFactory(request2).getShape("RoundedSquare").draw();
        service.getFactory(request2).getShape("Square").draw();


    }
}

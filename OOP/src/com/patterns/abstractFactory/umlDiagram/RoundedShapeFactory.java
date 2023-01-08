package com.patterns.abstractFactory.umlDiagram;

public class RoundedShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) throws Exception {
        if (shape.equals("RoundedSquare")) {
            return new RoundedRectangle();
        }
        else if (shape.equals("RoundedRectangle")) {
            return new RoundedRectangle();
        }

        else{
            throw new Exception("Error");
        }
    }
}

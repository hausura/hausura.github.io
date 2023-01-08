package com.patterns.abstractFactory.umlDiagram;

public  class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        if (shape.equals("Rectangle")) {
            return new Rectangle();
        }
        else if (shape.equals("Square")) {
            return new Square();
        }
        else if (shape.equals("RoundedSquare")) {
            return new RoundedSquare();
        }
        else if (shape.equals("RoundedRectangle")) {
            return new RoundedRectangle();
        }
        return null;
    }
}

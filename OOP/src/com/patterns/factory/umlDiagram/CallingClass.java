package com.patterns.factory.umlDiagram;

import java.util.Scanner;

public class CallingClass {

    public static void main(String[] args) {
        try {
            FruitFactory juice = new FruitFactory();
            String request = "Apple";
            juice.provideFruit(request).produceJuice();

            juice.provideFruit("Banana").produceJuice();
            juice.provideFruit("PineApple ").produceJuice();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

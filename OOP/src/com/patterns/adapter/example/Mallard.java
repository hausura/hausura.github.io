package com.patterns.adapter.example;

public class Mallard implements Duck{

    @Override
    public void fly() {
        System.out.println("Mallard can fly");
    }

    @Override
    public void quark() {
        System.out.println("quark quark");
    }
}

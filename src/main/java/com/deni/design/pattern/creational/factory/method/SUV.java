package com.deni.design.pattern.creational.factory.method;

public class SUV implements Car {
    @Override
    public void buildComponents(String message) {
        System.out.println("I am an SUV");
    }
}

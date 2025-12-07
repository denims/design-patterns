package com.deni.design.pattern.creational.factory.method;

public abstract class CarFactory {

    public void buildCar() {
        System.out.println("Building car");
        getCar().buildComponents("hello");
    }

    public abstract Car getCar();
}

package com.deni.design.pattern.creational.factory.method;

public class SedanCarFactoryImpl extends CarFactory {
    @Override
    public Car getCar() {
        return new Sedan();
    }
}

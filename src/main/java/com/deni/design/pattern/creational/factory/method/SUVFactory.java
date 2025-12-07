package com.deni.design.pattern.creational.factory.method;

public class SUVFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new SUV();
    }
}

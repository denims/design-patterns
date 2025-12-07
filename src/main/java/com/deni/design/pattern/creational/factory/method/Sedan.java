package com.deni.design.pattern.creational.factory.method;

public class Sedan implements Car {
    @Override
    public void buildComponents(String message) {
        System.out.println("I am a Sedan");
    }
}

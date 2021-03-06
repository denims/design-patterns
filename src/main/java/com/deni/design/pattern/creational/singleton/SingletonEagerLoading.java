package com.deni.design.pattern.creational.singleton;

public class SingletonEagerLoading {

    private static final SingletonEagerLoading singletonEagerLoading = new SingletonEagerLoading();

    private SingletonEagerLoading() {}

    public static SingletonEagerLoading getInstance() {
        return singletonEagerLoading;
    }
}

package com.deni.design.pattern.creational.builder.multibuilder;

public class UserNameBuilder extends UserBuilder{
    private final User user;

    public UserNameBuilder(User user) {
        this.user = user;
    }

    public UserNameBuilder withName(String name) {
        user.setUserName(name);

        return this;
    }
}

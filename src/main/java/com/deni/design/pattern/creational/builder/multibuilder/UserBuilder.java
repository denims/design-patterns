package com.deni.design.pattern.creational.builder.multibuilder;

public class UserBuilder {
    private final User user = new User();

    public UserAddressBuilder address() {
        return new UserAddressBuilder(user);
    }

    public UserNameBuilder name() {
        return new UserNameBuilder(user);
    }

    public User build() {
        return user;
    }

}

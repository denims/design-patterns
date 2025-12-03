package com.deni.design.pattern.creational.builder.multibuilder;

public class UserAddressBuilder extends UserBuilder {
    private final User user;

    public UserAddressBuilder(User user) {
        this.user = user;
    }

    public UserAddressBuilder withAddress(String address) {
        user.setAddress(address);
        return this;
    }
}

package com.deni.design.pattern.creational.factory.abs;

public class PrimaryComponentFactory implements ComponentFactory {
    @Override
    public Button getButton() {
        return new PrimaryButton();
    }

    @Override
    public TextBox getTextBox() {
        return new PrimaryTextBox();
    }
}

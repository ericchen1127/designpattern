package com.eric.designpattern.structural.flyweight;

/**
 * @author eric
 */
public final class Screen implements IPrintable {
    @Override
    public void print(UnsharedMessage message) {
        System.out.println("this is a screen");
        System.out.println("unshared message: " + message.getMessage());
    }
}

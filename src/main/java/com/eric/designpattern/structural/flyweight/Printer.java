package com.eric.designpattern.structural.flyweight;

/**
 * @author eric
 */
public final class Printer implements IPrintable {
    @Override
    public void print(UnsharedMessage message) {
        System.out.println("this is a printer");
        System.out.println("unshared message: " + message.getMessage());
    }
}

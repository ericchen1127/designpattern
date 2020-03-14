package com.eric.designpattern.structural.decorator;


/**
 * @author eric
 */
public final class Walkman implements IReadable {
    @Override
    public void read() {
        System.out.println("walkman is reading");
    }
}

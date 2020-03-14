package com.eric.designpattern.structural.proxy;

/**
 * @author eric
 */
public final class Walkman implements IReadable {
    @Override
    public void read() {
        System.out.println("walkman is reading");
    }
}

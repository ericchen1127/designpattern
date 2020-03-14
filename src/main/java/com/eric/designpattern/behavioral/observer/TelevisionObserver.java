package com.eric.designpattern.behavioral.observer;

/**
 * @author eric
 */
public final class TelevisionObserver extends AbstractObserver {
    @Override
    public void observe() {
        System.out.println("television report");
    }
}

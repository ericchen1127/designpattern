package com.eric.designpattern.behavioral.observer;

/**
 * @author eric
 */
public final class NewspaperObserver extends AbstractObserver {
    @Override
    public void observe() {
        System.out.println("newspaper report");
    }
}

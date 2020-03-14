package com.eric.designpattern.behavioral.observer;

/**
 * @author eric
 */
public final class StockSubject extends AbstractSubject {

    @Override
    public void notifyObserver(){
        for (AbstractObserver observer : observerList) {
            System.out.println("stock market is rising");
            observer.observe();
        }
    }
}

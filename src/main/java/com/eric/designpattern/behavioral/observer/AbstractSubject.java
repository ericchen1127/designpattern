package com.eric.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eric
 */
public abstract class AbstractSubject {
    protected List<AbstractObserver> observerList = new ArrayList<>();

    public void add(AbstractObserver observer){
        observerList.add(observer);
    }

    public void remove(AbstractObserver observer){
        observerList.remove(observer);
    }

    public abstract void notifyObserver();
}

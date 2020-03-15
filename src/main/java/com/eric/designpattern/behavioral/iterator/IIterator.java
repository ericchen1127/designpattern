package com.eric.designpattern.behavioral.iterator;

/**
 * @author eric
 */
public interface IIterator<T> {
    boolean hasNext();

    T next();
}

package com.eric.designpattern.behavioral.iterator;

/**
 * @author eric
 */
public interface IIterable<E> {
    IIterator<E> iterator();
}

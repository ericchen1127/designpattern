package com.eric.designpattern.behavioral.iterator;

/**
 * @author eric
 */
public interface IList<E> extends IIterable<E> {
    void add(E e);

    void remove(E e);
}

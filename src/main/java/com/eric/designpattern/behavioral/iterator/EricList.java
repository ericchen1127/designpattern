package com.eric.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eric
 */
public class EricList<E> implements IList<E> {
    private List<E> list = new ArrayList<>();

    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public IIterator<E> iterator() {
        return new EricIterator<E>();
    }

    private class EricIterator<E> implements IIterator<E> {
        private int index = -1;

        @Override
        public boolean hasNext() {
            return index < list.size() - 1;
        }

        @Override
        public E next() {
            if (hasNext()) {
                return (E) list.get(++index);
            }
            return null;
        }
    }
}

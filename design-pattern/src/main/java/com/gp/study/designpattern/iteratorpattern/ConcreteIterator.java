package com.gp.study.designpattern.iteratorpattern;

import java.util.List;

public class ConcreteIterator<E> implements Iterator<E> {
    private List<E> list;
    private int cursor;
    private E element;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size() - 1;
    }
}

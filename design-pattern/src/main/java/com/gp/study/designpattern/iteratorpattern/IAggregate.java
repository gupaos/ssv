package com.gp.study.designpattern.iteratorpattern;

public interface IAggregate<E> {
    void add(E e);

    void remove(E e);

    Iterator<E> iterator();

}

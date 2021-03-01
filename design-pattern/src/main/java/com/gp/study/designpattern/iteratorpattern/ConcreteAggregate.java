package com.gp.study.designpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements IAggregate<Integer> {
    private List<Integer> integerList;

    public ConcreteAggregate() {
        this.integerList = new ArrayList<>();
    }

    @Override
    public void add(Integer integer) {
        integerList.add(integer);
    }

    @Override
    public void remove(Integer integer) {
        integerList.remove(integer);
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

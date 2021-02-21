package com.gp.study.designpattern.factorypattrn.simplefactorypattern.standard;

public class ConcreteProductA implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("产品A");
    }
}

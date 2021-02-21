package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcreteProductBWithFamilyB implements IProductB {
    @Override
    public void doSomething() {
        System.out.println("产品族B的产品B");
    }
}

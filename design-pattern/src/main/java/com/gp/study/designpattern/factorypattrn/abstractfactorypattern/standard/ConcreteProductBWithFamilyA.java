package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcreteProductBWithFamilyA implements IProductB {
    @Override
    public void doSomething() {
        System.out.println("产品族A的产品B");
    }
}

package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcreteProductAWithFamilyB implements IProductA {
    @Override
    public void doSomething() {
        System.out.println("产品组B的产品A");
    }
}

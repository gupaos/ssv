package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcreteProductAWithFamilyA implements IProductA {
    @Override
    public void doSomething() {
        System.out.println("产品组A的产品A");
    }
}

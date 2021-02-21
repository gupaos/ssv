package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcretefactoryA implements  IFactory{
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyA();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyA();
    }
}

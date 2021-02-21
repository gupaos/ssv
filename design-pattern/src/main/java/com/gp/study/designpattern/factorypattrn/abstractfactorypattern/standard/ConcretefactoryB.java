package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class ConcretefactoryB implements  IFactory{
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFamilyB();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFamilyB();
    }
}

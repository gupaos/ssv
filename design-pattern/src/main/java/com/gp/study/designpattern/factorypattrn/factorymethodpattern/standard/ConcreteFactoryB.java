package com.gp.study.designpattern.factorypattrn.factorymethodpattern.standard;

public class ConcreteFactoryB implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductB();
    }
}

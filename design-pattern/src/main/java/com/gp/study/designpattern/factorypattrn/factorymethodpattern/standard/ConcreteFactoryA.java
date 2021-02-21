package com.gp.study.designpattern.factorypattrn.factorymethodpattern.standard;

public class ConcreteFactoryA implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductA();
    }
}

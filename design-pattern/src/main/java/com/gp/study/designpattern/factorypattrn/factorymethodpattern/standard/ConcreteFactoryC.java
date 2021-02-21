package com.gp.study.designpattern.factorypattrn.factorymethodpattern.standard;

public class ConcreteFactoryC implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ConcreteProductC();
    }
}

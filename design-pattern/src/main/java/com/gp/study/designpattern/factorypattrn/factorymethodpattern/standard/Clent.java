package com.gp.study.designpattern.factorypattrn.factorymethodpattern.standard;

public class Clent {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        factory.makeProduct().doSomething();

        factory = new ConcreteFactoryB();
        factory.makeProduct().doSomething();

        factory = new ConcreteFactoryC();
        factory.makeProduct().doSomething();
    }
}

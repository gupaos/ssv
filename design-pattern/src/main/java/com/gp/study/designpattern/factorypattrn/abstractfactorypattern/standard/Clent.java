package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.standard;

public class Clent {
    public static void main(String[] args) {
        IFactory factory = new ConcretefactoryA();
        factory.makeProductA().doSomething();
        factory.makeProductB().doSomething();

        factory = new ConcretefactoryB();
        factory.makeProductA().doSomething();
        factory.makeProductB().doSomething();
    }
}

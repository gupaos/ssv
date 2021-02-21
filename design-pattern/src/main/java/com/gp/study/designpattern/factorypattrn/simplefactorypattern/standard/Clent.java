package com.gp.study.designpattern.factorypattrn.simplefactorypattern.standard;

public class Clent {
    public static void main(String[] args) {
        IProduct iProduct = SimpleFactory.makeProduct(ConcreteProductA.class);
        iProduct.doSomething();
        IProduct iProductB = SimpleFactory.makeProduct(ConcreteProductB.class);
        iProductB.doSomething();
        IProduct iProductC = SimpleFactory.makeProduct(ConcreteProductC.class);
        iProductC.doSomething();
    }
}

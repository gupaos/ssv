package com.gp.study.designpattern.proxypattern.standard;

public class ConcreteSubject implements ISubject {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}

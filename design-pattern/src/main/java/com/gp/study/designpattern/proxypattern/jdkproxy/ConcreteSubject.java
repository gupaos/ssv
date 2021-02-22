package com.gp.study.designpattern.proxypattern.jdkproxy;

public class ConcreteSubject implements ISubject {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}

package com.gp.study.designpattern.proxypattern.cglibproxy;

public class clent {
    public static void main(String[] args) {
        ConcreteSubject instance = new CglibProxy().getInstance(ConcreteSubject.class);
        instance.doSomething();
    }
}

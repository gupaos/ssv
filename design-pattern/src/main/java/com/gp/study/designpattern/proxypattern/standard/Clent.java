package com.gp.study.designpattern.proxypattern.standard;

public class Clent {
    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        subject.doSomething();
        System.out.println("==============");
        subject = new StaticProxy(subject);
        subject.doSomething();
    }
}

package com.gp.study.designpattern.proxypattern.jdkproxy;

public class clent {
    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        subject.doSomething();
        System.out.println("==================");
        subject = new JdkProxy().getInstance(new ConcreteSubject());
        subject.doSomething();
    }
}

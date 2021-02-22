package com.gp.study.designpattern.proxypattern.standard;

public class StaticProxy implements ISubject {
    private ISubject subject;

    public StaticProxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {
        before();
        this.subject.doSomething();
        after();
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}

package com.gp.study.designpattern.proxypattern.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private ISubject target;

    public ISubject getInstance(ISubject target) {
        this.target = target;
        Class<? extends ISubject> aClass = target.getClass();
        return (ISubject) java.lang.reflect.Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}

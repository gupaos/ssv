package com.gp.study.designpattern.decoratorpattern.standard;

public class Client {
    public static void main(String[] args) {
        ICompontent compontent = new ConcreteCompontentA();
        compontent.doSomething();
        System.out.println("==================");
        compontent = new ConcreteDecoratorA(compontent);
        compontent.doSomething();
        System.out.println("==================");
        compontent = new ConcreteDecoratorB(compontent);
        compontent.doSomething();
    }
}

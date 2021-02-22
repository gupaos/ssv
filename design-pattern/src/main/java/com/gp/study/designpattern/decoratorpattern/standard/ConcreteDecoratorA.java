package com.gp.study.designpattern.decoratorpattern.standard;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(ICompontent compontent) {
        super(compontent);
    }

    @Override
    public void doSomething() {
        System.out.println("ConcreteDecoratorA 添加功能");
        super.doSomething();
    }
}

package com.gp.study.designpattern.decoratorpattern.standard;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(ICompontent compontent) {
        super(compontent);
    }

    @Override
    public void doSomething() {
        System.out.println("ConcreteDecoratorB 添加功能");
        super.doSomething();
    }
}

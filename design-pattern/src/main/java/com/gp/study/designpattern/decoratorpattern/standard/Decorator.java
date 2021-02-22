package com.gp.study.designpattern.decoratorpattern.standard;

public abstract class Decorator implements ICompontent {
    protected ICompontent compontent;

    public Decorator(ICompontent compontent) {
        this.compontent = compontent;
    }

    @Override
    public void doSomething() {
        this.compontent.doSomething();
    }
}

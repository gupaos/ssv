package com.gp.study.designpattern.singletonPattern;

public enum EnumSingleton {
    INSTANCE;

    public void doSamething() {
        System.out.println("EnumSingletondo Samething ... ");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}

package com.gp.study.designpattern.singletonPattern;


public class HungrySingleton {
    private HungrySingleton() {}

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}

package com.gp.study.designpattern.singletonPattern;


public class LazySingleton {
    private LazySingleton() {
    }

    private static volatile LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

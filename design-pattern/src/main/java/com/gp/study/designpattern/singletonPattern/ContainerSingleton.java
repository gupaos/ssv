package com.gp.study.designpattern.singletonPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static final Map<Class<?>, Object> MAP = new ConcurrentHashMap<>();

    public static <T> T getInstance(Class<T> clazz) {
        T t = (T) MAP.get(clazz);
        if (t == null) {
            synchronized (ContainerSingleton.class) {
                t = (T) MAP.get(clazz);
                if (t == null) {
                    try {
                        t = clazz.newInstance();
                        MAP.put(clazz, t);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return t;

    }
}

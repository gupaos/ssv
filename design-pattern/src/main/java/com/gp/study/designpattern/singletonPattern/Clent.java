package com.gp.study.designpattern.singletonPattern;

public class Clent {
    public static void main(String[] args) {
        TestA instance = ContainerSingleton.getInstance(TestA.class);
        System.out.println(instance);

    }
}

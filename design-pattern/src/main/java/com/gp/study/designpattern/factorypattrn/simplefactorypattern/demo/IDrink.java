package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo;

public interface IDrink {
    String getName();

    Double getPrice();

    default void printMessge() {
        System.out.println("饮料：" + getName() + ", 价格：" + getPrice() + "元");
    }
}

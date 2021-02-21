package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo;

public class SimpleFactory {
    public static IDrink makeDrink(Class<? extends IDrink> clazz) {

        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.gp.study.designpattern.factorypattrn.simplefactorypattern.standard;

public class SimpleFactory {
    public static IProduct makeProduct(Class<? extends IProduct> clazz) {

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

package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.blacktheme.BlackThemeFactory;
import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.redtheme.RedThemeFactory;

public class Clent {
    public static void main(String[] args) {
        IFactory factory = new BlackThemeFactory();
        System.out.println(factory.makeButton().getName() + ";" + factory.makeInput().getName());
        factory = new RedThemeFactory();
        System.out.println(factory.makeButton().getName() + ";" + factory.makeInput().getName());
    }
}

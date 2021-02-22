package com.gp.study.designpattern.facadepattern;

public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void doA() {
        subSystemA.doA();
    }

    public void doB() {
        subSystemB.doB();
    }

    public void doC() {
        subSystemC.doC();
    }
}

package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo;


public interface IFactory {
    IButton makeButton();

    IInput makeInput();
}

package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.blacktheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IButton;
import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IFactory;
import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IInput;

public class BlackThemeFactory implements IFactory {
    @Override
    public IButton makeButton() {
        return new BlackButton();
    }

    @Override
    public IInput makeInput() {
        return new BlackInput();
    }
}

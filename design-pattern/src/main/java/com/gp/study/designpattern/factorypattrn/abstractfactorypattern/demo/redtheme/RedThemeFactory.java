package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.redtheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IButton;
import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IFactory;
import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IInput;

public class RedThemeFactory implements IFactory {
    @Override
    public IButton makeButton() {
        return new RedButton();
    }

    @Override
    public IInput makeInput() {
        return new RedInput();
    }
}

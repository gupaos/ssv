package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.redtheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IButton;

public class RedButton implements IButton {
    @Override
    public String getName() {
        return "红色按钮";
    }
}

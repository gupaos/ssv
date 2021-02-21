package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.blacktheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IButton;

public class BlackButton implements IButton {
    @Override
    public String getName() {
        return "黑色按钮";
    }
}

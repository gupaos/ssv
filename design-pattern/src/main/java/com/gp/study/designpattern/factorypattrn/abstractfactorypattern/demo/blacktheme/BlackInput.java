package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.blacktheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IInput;

public class BlackInput implements IInput {
    @Override
    public String getName() {
        return "黑色文本框";
    }
}

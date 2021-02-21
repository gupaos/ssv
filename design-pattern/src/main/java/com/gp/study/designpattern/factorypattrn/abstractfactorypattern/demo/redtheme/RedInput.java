package com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.redtheme;

import com.gp.study.designpattern.factorypattrn.abstractfactorypattern.demo.IInput;

public class RedInput implements IInput {
    @Override
    public String getName() {
        return "红色文本框";
    }
}

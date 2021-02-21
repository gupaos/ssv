package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks;

import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.IDrink;

public class Beer implements IDrink {

    @Override
    public String getName() {
        return "啤酒";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }
}

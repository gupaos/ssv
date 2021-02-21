package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks;

import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.IDrink;

public class Sprite implements IDrink {
    @Override
    public String getName() {
        return "雪碧";
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }
}

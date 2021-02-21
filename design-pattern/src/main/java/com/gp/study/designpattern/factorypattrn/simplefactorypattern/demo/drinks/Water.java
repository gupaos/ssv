package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks;

import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.IDrink;

public class Water implements IDrink {
    @Override
    public String getName() {
        return "水";
    }

    @Override
    public Double getPrice() {
        return 2.0;
    }

}

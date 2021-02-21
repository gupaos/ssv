package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers;


import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;

public class HarbinBeer implements IBeer {
    @Override
    public String getName() {
        return "哈尔滨啤酒";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }
}

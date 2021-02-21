package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;

public class SnowBeer implements IBeer {
    @Override
    public String getName() {
        return "雪花啤酒";
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }
}

package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;

public class WusuBeer implements IBeer {
    @Override
    public String getName() {
        return "乌苏啤酒";
    }

    @Override
    public Double getPrice() {
        return 8.0;
    }
}

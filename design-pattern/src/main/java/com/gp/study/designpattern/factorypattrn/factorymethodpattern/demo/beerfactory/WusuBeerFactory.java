package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeerFactory;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers.WusuBeer;

public class WusuBeerFactory implements IBeerFactory {
    @Override
    public IBeer makeBeer() {
        return new WusuBeer();
    }
}

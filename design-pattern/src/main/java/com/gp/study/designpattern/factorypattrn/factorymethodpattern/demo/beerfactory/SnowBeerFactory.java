package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeerFactory;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers.SnowBeer;

public class SnowBeerFactory implements IBeerFactory {
    @Override
    public IBeer makeBeer() {
        return new SnowBeer();
    }
}

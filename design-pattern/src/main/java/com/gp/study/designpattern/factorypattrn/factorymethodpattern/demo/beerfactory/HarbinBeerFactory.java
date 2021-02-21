package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeer;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.IBeerFactory;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beers.HarbinBeer;

public class HarbinBeerFactory implements IBeerFactory {
    @Override
    public IBeer makeBeer() {
        return new HarbinBeer();
    }
}

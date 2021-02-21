package com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo;

import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory.HarbinBeerFactory;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory.SnowBeerFactory;
import com.gp.study.designpattern.factorypattrn.factorymethodpattern.demo.beerfactory.WusuBeerFactory;

public class Clent {
    public static void main(String[] args) {
        IBeerFactory beerFactory = new HarbinBeerFactory();
        IBeer beer = beerFactory.makeBeer();
        System.out.println(String.format("啤酒名称：%s,价格：%f元", beer.getName(), beer.getPrice()));
         beerFactory = new SnowBeerFactory();
         beer = beerFactory.makeBeer();
        System.out.println(String.format("啤酒名称：%s,价格：%f元", beer.getName(), beer.getPrice()));
         beerFactory = new WusuBeerFactory();
         beer = beerFactory.makeBeer();
        System.out.println(String.format("啤酒名称：%s,价格：%f元", beer.getName(), beer.getPrice()));
    }

}

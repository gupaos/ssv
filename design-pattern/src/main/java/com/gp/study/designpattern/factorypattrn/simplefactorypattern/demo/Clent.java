package com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo;

import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks.Beer;
import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks.Sprite;
import com.gp.study.designpattern.factorypattrn.simplefactorypattern.demo.drinks.Water;

public class Clent {
    public static void main(String[] args) {
        IDrink beer = SimpleFactory.makeDrink(Beer.class);
        beer.printMessge();
        IDrink sprite = SimpleFactory.makeDrink(Sprite.class);
        sprite.printMessge();
        IDrink water = SimpleFactory.makeDrink(Water.class);
        water.printMessge();
    }
}

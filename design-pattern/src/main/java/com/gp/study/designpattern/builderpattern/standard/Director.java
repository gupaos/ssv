package com.gp.study.designpattern.builderpattern.standard;

public class Director {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Product product = builder.setName("名称").setMsg("信息").bulider();
    }
}

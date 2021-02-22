package com.gp.study.designpattern.builderpattern.standard;

public class ConcreteBuilder implements IBuilder<Product> {
    private Product product = new Product();

    public ConcreteBuilder setName(String name) {
        product.setName(name);
        return this;
    }

    public ConcreteBuilder setMsg(String msg) {
        product.setMsg(msg);
        return this;
    }

    @Override
    public Product bulider() {
        return product;
    }
}

package com.gp.study.designpattern.prototypepattern.standard;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
public class ConcretePrototype implements IPrototype<ConcretePrototype> {
    private String name;
    private int age;

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName(this.name);
        concretePrototype.setAge(this.age);
        return concretePrototype;
    }
}

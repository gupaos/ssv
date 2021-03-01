package com.gp.study.designpattern.flyweightpattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcreteTicket implements ITicket {
    String from;
    String to;

    @Override
    public void showInfo() {
        System.out.println("do something...");
    }
}

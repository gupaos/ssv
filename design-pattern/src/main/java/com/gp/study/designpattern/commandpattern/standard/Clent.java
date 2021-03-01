package com.gp.study.designpattern.commandpattern.standard;

public class Clent {
    public static void main(String[] args) {
        ICommand command = new CommandA();
        Invoke invoke = new Invoke(command);
        invoke.action();
    }
}

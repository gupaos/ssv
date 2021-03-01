package com.gp.study.designpattern.commandpattern.standard;

public class CommandA implements ICommand {
    private Receiver receiver = new Receiver();
    @Override
    public void execute() {
        this.receiver.action();
    }
}

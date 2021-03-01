package com.gp.study.designpattern.commandpattern.standard;

/**
 * 接收客户端命令并执行命令
 */
public class Invoke {

    private ICommand command;

    public Invoke(ICommand command){
        this.command = command;
    }
    public void action(){
        command.execute();
    }
}

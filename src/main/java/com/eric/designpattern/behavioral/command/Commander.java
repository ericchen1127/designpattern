package com.eric.designpattern.behavioral.command;

/**
 * @author eric
 */
public class Commander {
    private ICommandable commander;

    public Commander(ICommandable commander) {
        this.commander = commander;
    }

    public void command(){
        System.out.println("this is a commander, who is sending a command");
        commander.command();
    }
}

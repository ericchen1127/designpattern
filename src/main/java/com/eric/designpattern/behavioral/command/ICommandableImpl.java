package com.eric.designpattern.behavioral.command;

/**
 * @author eric
 */
public class ICommandableImpl implements ICommandable {
    private IExecutable executor;

    public ICommandableImpl(IExecutable executor) {
        this.executor = executor;
    }

    @Override
    public void command() {
        System.out.println("this is a command");
        executor.execute();
    }
}

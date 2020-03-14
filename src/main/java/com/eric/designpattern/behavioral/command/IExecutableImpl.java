package com.eric.designpattern.behavioral.command;

/**
 * @author eric
 */
public class IExecutableImpl implements IExecutable {
    @Override
    public void execute() {
        System.out.println("this is a real executor");
    }
}

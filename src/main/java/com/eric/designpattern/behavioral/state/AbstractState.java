package com.eric.designpattern.behavioral.state;

/**
 * @author eric
 */
public abstract class AbstractState {
    protected abstract void act(StateContext context);
}

package com.eric.designpattern.behavioral.state;

/**
 * @author eric
 */
public class StateContext {
    AbstractState state;

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void act(){
        state.act(this);
    }
}

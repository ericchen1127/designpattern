package com.eric.designpattern.behavioral.state;

/**
 * @author eric
 */
public final class AngryState extends AbstractState {

    @Override
    protected void act(StateContext context) {
        System.out.println("anger state: kiss and hug her");
        context.setState(new HappyState());
    }
}

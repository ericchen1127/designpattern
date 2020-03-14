package com.eric.designpattern.behavioral.state;

/**
 * @author eric
 */
public final class HappyState extends AbstractState {

    @Override
    protected void act(StateContext context) {
        System.out.println("happy state: annoy and ignore her");
        context.setState(new AngryState());
    }
}

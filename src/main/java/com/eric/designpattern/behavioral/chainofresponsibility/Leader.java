package com.eric.designpattern.behavioral.chainofresponsibility;

/**
 * @author eric
 */
public final class Leader extends AbstractApprover {
    @Override
    protected boolean check(int days) {
        return days > 0 && days <= 3;
    }

    @Override
    protected void doApprove() {
        System.out.println("this is a leader, approved");
    }
}

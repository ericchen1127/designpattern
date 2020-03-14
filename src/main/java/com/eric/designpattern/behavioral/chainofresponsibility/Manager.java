package com.eric.designpattern.behavioral.chainofresponsibility;

/**
 * @author eric
 */
public final class Manager extends AbstractApprover {
    @Override
    protected boolean meetCondition(int days) {
        return days > 3 && days <= 10;
    }

    @Override
    protected void doApprove() {
        System.out.println("this is a manager, approved");
    }
}

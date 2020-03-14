package com.eric.designpattern.behavioral.chainofresponsibility;

/**
 * @author eric
 */
public abstract class AbstractApprover {
    private AbstractApprover next;

    public AbstractApprover getNext() {
        return next;
    }

    public void setNext(AbstractApprover next) {
        this.next = next;
    }

    public void approve(int days) {
        if (meetCondition(days)) {
            doApprove();
        } else {
            System.out.println("go to the next approver");
            if (getNext() != null) {
                getNext().approve(days);
            } else{
                System.out.println("can't not find an approver for this request");
            }
        }
    }

    protected abstract boolean meetCondition(int days);

    protected abstract void doApprove();
}

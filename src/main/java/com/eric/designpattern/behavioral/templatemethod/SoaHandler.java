package com.eric.designpattern.behavioral.templatemethod;

/**
 * @author eric
 */
public final class SoaHandler<Request, Response> extends AbstractSoaHandler<Request, Response> {
    @Override
    protected void init(Request request) {
        System.out.println("init..");
    }

    @Override
    protected void verify(Request request) {
        System.out.println("verify..");
    }

    @Override
    protected Response process(Request request) {
        System.out.println("process..");
        return null;
    }
}

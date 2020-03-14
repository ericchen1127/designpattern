package com.eric.designpattern.behavioral.templatemethod;

/**
 * @author eric
 */
public abstract class AbstractSoaHandler<Request, Response> {

    public Response handle(Request request) {

        log();

        init(request);

        verify(request);

        return process(request);
    }

    private void log() {
        System.out.println("log..");
    }

    protected abstract void init(Request request);

    protected abstract void verify(Request request);

    protected abstract Response process(Request request);
}

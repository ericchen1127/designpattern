package com.eric.designpattern.structural.decorator;

/**
 * @author eric
 */
public final class WalkmanDecorator extends ReaderDecorator{
    public WalkmanDecorator(IReadable reader) {
        super(reader);
    }

    @Override
    public void read() {
        readBefore();
        super.read();
        readAfter();
    }

    private void readBefore() {
        System.out.println("walkman is turned on");
    }

    private void readAfter() {
        System.out.println("walkman is turned off");
    }
}

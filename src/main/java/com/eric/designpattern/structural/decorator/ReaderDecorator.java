package com.eric.designpattern.structural.decorator;

/**
 * @author eric
 */
public abstract class ReaderDecorator implements IReadable {
    private IReadable reader;

    public ReaderDecorator(IReadable reader) {
        this.reader = reader;
    }

    @Override
    public void read() {
        reader.read();
    }
}

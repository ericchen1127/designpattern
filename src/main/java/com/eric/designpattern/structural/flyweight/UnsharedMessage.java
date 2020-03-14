package com.eric.designpattern.structural.flyweight;

/**
 * @author eric
 */
public final class UnsharedMessage {
    private String message;

    public UnsharedMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

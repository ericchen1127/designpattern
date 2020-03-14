package com.eric.designpattern.structural.bridge;

/**
 * @author eric
 */
public final class Circle extends AbstractShape {
    public Circle(IColorable color) {
        super(color);
    }

    @Override
    public String getDesc() {
        return super.getColor4Shape() + " circle";
    }
}

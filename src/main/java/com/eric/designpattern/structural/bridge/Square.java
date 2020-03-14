package com.eric.designpattern.structural.bridge;

/**
 * @author eric
 */
public final class Square extends AbstractShape {
    public Square(IColorable color) {
        super(color);
    }

    @Override
    public String getDesc() {
        return super.getColor4Shape() + " square";
    }
}

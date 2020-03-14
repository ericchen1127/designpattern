package com.eric.designpattern.creative.prototype;

/**
 * @author eric
 */
public final class ProtoType implements Cloneable {
    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType)super.clone();
    }
}

package com.eric.designpattern.structural.composite;

/**
 * @author eric
 */
public final class LeafNode extends AbstractNode {

    public LeafNode(String nodeName) {
        super(nodeName);
    }

    @Override
    public void show() {
        System.out.println("this is a leaf node:" + super.getNodeName());
    }
}

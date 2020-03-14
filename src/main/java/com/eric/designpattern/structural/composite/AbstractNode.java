package com.eric.designpattern.structural.composite;

/**
 * @author eric
 */
public abstract class AbstractNode {
    private String nodeName;

    public AbstractNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public abstract void show();

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
}

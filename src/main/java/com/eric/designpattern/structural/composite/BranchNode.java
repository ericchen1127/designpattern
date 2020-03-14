package com.eric.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eric
 */
public final class BranchNode extends AbstractNode {

    private List<AbstractNode> subNodeList = new ArrayList<>();

    public BranchNode(String nodeName) {
        super(nodeName);
    }

    public void add(AbstractNode node) {
        if (!subNodeList.contains(node)) {
            subNodeList.add(node);
        }
    }

    public void remove(AbstractNode node) {
        if (subNodeList.contains(node)) {
            subNodeList.remove(node);
        }
    }

    public AbstractNode get(int i) {
        if (i < 0 && i >= subNodeList.size()) {
            return null;
        }
        return subNodeList.get(i);
    }

    @Override
    public void show() {
        System.out.println("this is a branch node:" + super.getNodeName());
        for (AbstractNode node : subNodeList) {
            node.show();
        }
    }
}

package structural;

import com.eric.designpattern.structural.composite.AbstractNode;
import com.eric.designpattern.structural.composite.BranchNode;
import com.eric.designpattern.structural.composite.LeafNode;
import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite() {
        final LeafNode leafNode1 = new LeafNode("leaf node 1");
        final LeafNode leafNode2 = new LeafNode("leaf node 2");
        final LeafNode leafNode3 = new LeafNode("leaf node 3");
        final BranchNode branchNode1 = new BranchNode("branch node 1");
        final BranchNode branchNode2 = new BranchNode("branch node 2");

        branchNode1.add(leafNode1);
        branchNode1.add(branchNode2);

        branchNode2.add(leafNode2);
        branchNode2.add(leafNode3);

        branchNode1.show();
    }
}

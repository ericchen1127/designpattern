package creative;

import com.eric.designpattern.creative.prototype.ProtoType;
import org.junit.Assert;
import org.junit.Test;

public class ProtoTypeTest {
    @Test
    public void testProtoType() throws CloneNotSupportedException {
        ProtoType protoType1 = new ProtoType();
        final ProtoType protoType2 = protoType1.clone();
        Assert.assertEquals(false, protoType1 == protoType2);
    }
}

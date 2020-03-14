package creative;

import com.eric.designpattern.creative.simplefactory.HashMapSimpleFactory;
import org.junit.Assert;
import org.junit.Test;

public class HashMapSimpleFactoryTest {
    @Test
    public void testFactory() {
        Assert.assertEquals("com.eric.designpattern.creative.bean.SqlUser",
                HashMapSimpleFactory.getUser("SqlUser").getClass().getName());
    }
}

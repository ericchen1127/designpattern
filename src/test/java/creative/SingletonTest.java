package creative;

import com.eric.designpattern.creative.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertEquals(true, instance1 == instance2);
    }
}

package structural;

import com.eric.designpattern.structural.proxy.WalkmanProxy;
import org.junit.Test;

public class ProxyTest {
    /*
    * 客户端只有 Proxy 的引用，而无实际被代理类的引用
    * */
    @Test
    public void testProxy(){
        new WalkmanProxy().read();
    }
}

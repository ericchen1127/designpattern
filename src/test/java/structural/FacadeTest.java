package structural;

import com.eric.designpattern.structural.facade.SystemFacade1;
import com.eric.designpattern.structural.facade.SystemFacade2;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void testFacade(){
        final SystemFacade1 systemFacade1 = new SystemFacade1();
        systemFacade1.facadeMethod();
        final SystemFacade2 systemFacade2 = new SystemFacade2();
        systemFacade2.facadeMethod();
    }
}

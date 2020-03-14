package behavioral;

import com.eric.designpattern.behavioral.templatemethod.SoaHandler;
import org.junit.Test;

public class TemplateMethodTest {
    @Test
    public void testTemplateMethod(){
        final SoaHandler soaHandler = new SoaHandler();
        soaHandler.handle(null);
    }
}

package structural;

import com.eric.designpattern.structural.flyweight.FlyweightFactory;
import com.eric.designpattern.structural.flyweight.IPrintable;
import com.eric.designpattern.structural.flyweight.UnsharedMessage;
import org.junit.Test;

public class FlyweightTest {
    @Test
    public void testFlyweight() {
        FlyweightFactory factory = new FlyweightFactory();

        final IPrintable screen = factory.getInstance("Screen");
        screen.print(new UnsharedMessage("eric is handsome"));

        final IPrintable printer = factory.getInstance("Printer");
        printer.print(new UnsharedMessage("yxh is beautiful"));
    }
}

package structural;

import com.eric.designpattern.structural.bridge.AbstractShape;
import com.eric.designpattern.structural.bridge.Blue;
import com.eric.designpattern.structural.bridge.Circle;
import com.eric.designpattern.structural.bridge.IColorable;
import com.eric.designpattern.structural.bridge.Red;
import com.eric.designpattern.structural.bridge.Square;
import org.junit.Test;

public class BridgeTest {
    @Test
    public void testBridge() {
        IColorable blue = new Blue();
        IColorable red = new Red();
        AbstractShape square = new Square(blue);
        System.out.println(square.getDesc());
        square = new Square(red);
        System.out.println(square.getDesc());

        AbstractShape circle = new Circle(blue);
        System.out.println(circle.getDesc());
        circle = new Circle(blue);
        System.out.println(circle.getDesc());
    }
}

package structural;

import com.eric.designpattern.structural.decorator.ReaderDecorator;
import com.eric.designpattern.structural.decorator.Walkman;
import com.eric.designpattern.structural.decorator.WalkmanDecorator;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testDecorator(){
        ReaderDecorator decorator = new WalkmanDecorator(new Walkman());
        decorator.read();
    }
}

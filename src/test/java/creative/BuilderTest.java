package creative;

import com.eric.designpattern.creative.bean.User4Builder;
import com.eric.designpattern.creative.builder.AbstractBuilder;
import com.eric.designpattern.creative.builder.ConcreteBuilder;
import com.eric.designpattern.creative.builder.Director;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void testBuilder() {
        final AbstractBuilder builder = new ConcreteBuilder();
        final Director director = new Director(builder, "eric", "male", 18);
        final User4Builder user = director.construct();

        Assert.assertEquals("eric", user.getName());
        Assert.assertEquals("male", user.getGender());
        Assert.assertEquals(18,user.getAge());

        System.out.println(user.toString());
    }
}

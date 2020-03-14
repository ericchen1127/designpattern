package creative;

import com.eric.designpattern.creative.bean.AbstractUser;
import com.eric.designpattern.creative.factorymethod.IUserFactory;
import com.eric.designpattern.creative.factorymethod.SqlUserFactory;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void testFactoryMethod() {
        IUserFactory sqlFactory = new SqlUserFactory();
        final AbstractUser sqlUser = sqlFactory.getUser();
        Assert.assertEquals("com.eric.designpattern.creative.bean.SqlUser",
                sqlUser.getClass().getName());
    }
}

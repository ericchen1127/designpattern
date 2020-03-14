package creative;

import com.eric.designpattern.creative.abstractfactory.FirstClassUserFactory;
import com.eric.designpattern.creative.bean.DocumentUser;
import com.eric.designpattern.creative.bean.RelationalUser;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory(){
        final FirstClassUserFactory firstClassUserFactory = new FirstClassUserFactory();

        final RelationalUser relationalUser = firstClassUserFactory.getRelationalUser();
        Assert.assertEquals("com.eric.designpattern.creative.bean.OracleUser",
                relationalUser.getClass().getName());

        final DocumentUser documentUser = firstClassUserFactory.getDocumentUser();
        Assert.assertEquals("com.eric.designpattern.creative.bean.MongoUser",
                documentUser.getClass().getName());
    }
}

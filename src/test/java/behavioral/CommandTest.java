package behavioral;

import com.eric.designpattern.behavioral.command.Commander;
import com.eric.designpattern.behavioral.command.ICommandableImpl;
import com.eric.designpattern.behavioral.command.IExecutableImpl;
import org.junit.Test;

public class CommandTest {
    @Test
    public void testCommand(){
        new Commander(new ICommandableImpl(new IExecutableImpl())).command();
    }
}

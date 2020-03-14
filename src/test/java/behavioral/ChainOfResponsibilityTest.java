package behavioral;

import com.eric.designpattern.behavioral.chainofresponsibility.Leader;
import com.eric.designpattern.behavioral.chainofresponsibility.Manager;
import org.junit.Test;

public class ChainOfResponsibilityTest {
    @Test
    public void testChainOfResponsibility() {
        Leader leader = new Leader();
        Manager manager = new Manager();
        leader.setNext(manager);
        System.out.println("ask for 3 days leave");
        leader.approve(3);
        System.out.println("ask for 5 days leave");
        leader.approve(5);
        System.out.println("ask for 10 days leave");
        leader.approve(11);
    }
}

package behavioral;

import com.eric.designpattern.behavioral.iterator.EricList;
import com.eric.designpattern.behavioral.iterator.IIterator;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void testStringIterator() {
        final EricList<String> list = new EricList<String>();
        list.add("eric");
        list.add("christal");
        list.add("yi-yao");
        list.add("mu-yao");
        final IIterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testIntegerIterator() {
        final EricList<Integer> list = new EricList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        final IIterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

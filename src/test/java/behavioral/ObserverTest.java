package behavioral;

import com.eric.designpattern.behavioral.observer.NewspaperObserver;
import com.eric.designpattern.behavioral.observer.StockSubject;
import com.eric.designpattern.behavioral.observer.TelevisionObserver;
import org.junit.Test;

public class ObserverTest {
    @Test
    public void testObserver(){
        final StockSubject stockSubject = new StockSubject();
        stockSubject.add(new NewspaperObserver());
        stockSubject.add(new TelevisionObserver());
        stockSubject.notifyObserver();
    }
}

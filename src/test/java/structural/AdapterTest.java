package structural;

import com.eric.designpattern.structural.adapter.SpeakerAdapter;
import com.eric.designpattern.structural.proxy.Walkman;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testAdapter() {
        new SpeakerAdapter(new Walkman()).speak();
    }
}

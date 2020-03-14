package behavioral;

import com.eric.designpattern.behavioral.strategy.AddPromotionStrategy;
import com.eric.designpattern.behavioral.strategy.MultiplyPromotionStrategy;
import com.eric.designpattern.behavioral.strategy.PromotionStrategyContext;
import org.junit.Test;

import java.math.BigDecimal;

public class StrategyTest {
    @Test
    public void testStrategy(){
        PromotionStrategyContext addPromotionContext = new PromotionStrategyContext(new AddPromotionStrategy());
        System.out.println(addPromotionContext.promote(new BigDecimal(100), new BigDecimal(10)));

        PromotionStrategyContext multiplyPromotionContext = new PromotionStrategyContext(new MultiplyPromotionStrategy());
        System.out.println(multiplyPromotionContext.promote(new BigDecimal(100), new BigDecimal(0.1)));
    }
}

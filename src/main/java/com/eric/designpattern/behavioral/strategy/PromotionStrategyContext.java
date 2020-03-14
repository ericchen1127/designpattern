package com.eric.designpattern.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author eric
 */
public class PromotionStrategyContext {
    private IPromotionable strategy;

    public PromotionStrategyContext(IPromotionable strategy) {
        this.strategy = strategy;
    }

    public BigDecimal promote(BigDecimal price, BigDecimal factor){
        return strategy.promote(price, factor);
    }
}

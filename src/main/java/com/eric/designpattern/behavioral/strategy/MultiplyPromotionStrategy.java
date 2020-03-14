package com.eric.designpattern.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author eric
 */
public final class MultiplyPromotionStrategy implements IPromotionable {
    @Override
    public BigDecimal promote(BigDecimal price, BigDecimal factor) {
        return price.multiply(factor.add(new BigDecimal(1)));
    }
}

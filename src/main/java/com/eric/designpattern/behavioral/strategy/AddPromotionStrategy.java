package com.eric.designpattern.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author eric
 */
public final class AddPromotionStrategy implements IPromotionable {
    @Override
    public BigDecimal promote(BigDecimal price, BigDecimal factor) {
        return price.add(factor);
    }
}

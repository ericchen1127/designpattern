package com.eric.designpattern.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author eric
 */
public interface IPromotionable {
    BigDecimal promote(BigDecimal price, BigDecimal factor);
}

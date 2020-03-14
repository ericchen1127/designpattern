package com.eric.designpattern.creative.factorymethod;

import com.eric.designpattern.creative.bean.AbstractUser;
import com.eric.designpattern.creative.bean.OracleUser;

/**
 * @author eric
 */
public final class OracleUserFactory implements IUserFactory {
    @Override
    public AbstractUser getUser() {
        return new OracleUser();
    }
}

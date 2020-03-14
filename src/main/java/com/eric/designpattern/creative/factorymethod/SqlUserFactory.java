package com.eric.designpattern.creative.factorymethod;

import com.eric.designpattern.creative.bean.AbstractUser;
import com.eric.designpattern.creative.bean.SqlUser;

/**
 * @author eric
 */
public final class SqlUserFactory implements IUserFactory {
    @Override
    public AbstractUser getUser() {
        return new SqlUser();
    }
}

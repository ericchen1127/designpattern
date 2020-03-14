package com.eric.designpattern.creative.factorymethod;

import com.eric.designpattern.creative.bean.AbstractUser;

/**
 * @author eric
 */
public interface IUserFactory {

    AbstractUser getUser();
}

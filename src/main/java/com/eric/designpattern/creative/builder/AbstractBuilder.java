package com.eric.designpattern.creative.builder;

import com.eric.designpattern.creative.bean.User4Builder;

/**
 * @author eric
 */
public abstract class AbstractBuilder {
    private User4Builder user = new User4Builder();

    public User4Builder getUser() {
        return user;
    }

    public abstract void buildName(String name);

    public abstract void buildGender(String gender);

    public abstract void buildAge(int age);

}

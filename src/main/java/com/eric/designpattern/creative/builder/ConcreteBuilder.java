package com.eric.designpattern.creative.builder;

/**
 * @author eric
 */
public final class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildName(String name) {
        getUser().setName(name);
    }

    @Override
    public void buildGender(String gender) {
        getUser().setGender(gender);
    }

    @Override
    public void buildAge(int age) {
        getUser().setAge(age);
    }
}

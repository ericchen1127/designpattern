package com.eric.designpattern.creative.builder;

import com.eric.designpattern.creative.bean.User4Builder;

/**
 * @author eric
 */
public final class Director {
    private AbstractBuilder builder;
    private String name;
    private String gender;
    private int age;

    public Director() {

    }

    public Director(AbstractBuilder builder, String name, String gender, int age) {
        this.builder = builder;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public User4Builder construct() {
        builder.buildName(this.name);
        builder.buildGender(this.gender);
        builder.buildAge(this.age);
        return builder.getUser();
    }
}

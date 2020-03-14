package com.eric.designpattern.creative.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eric
 */
public final class Multiton {
    private static List<Multiton> instances;

    private Multiton() {
    }

    public static List<Multiton> getInstances(int number) {
        if (instances == null) {
            instances = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                instances.add(new Multiton());
            }
        }
        return instances;
    }
}

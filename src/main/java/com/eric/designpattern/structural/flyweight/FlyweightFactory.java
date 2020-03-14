package com.eric.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * @author eric
 */
public class FlyweightFactory {
    private static HashMap<String, IPrintable> map = new HashMap<>();

    public FlyweightFactory() {
        map.put("Screen", new Screen());
        map.put("Printer", new Printer());
    }

    public IPrintable getInstance(String key) {
        return map.get(key);
    }
}

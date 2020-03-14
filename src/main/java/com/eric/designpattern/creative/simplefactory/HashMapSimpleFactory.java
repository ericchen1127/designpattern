package com.eric.designpattern.creative.simplefactory;

import com.eric.designpattern.creative.bean.AbstractUser;
import com.eric.designpattern.creative.bean.OracleUser;
import com.eric.designpattern.creative.bean.SqlUser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author eric
 * 使用HashMap的简单工厂
 */
public final class HashMapSimpleFactory {
    private final static Map<String, AbstractUser> userMap = new HashMap<>();

    static {
        userMap.put("SqlUser", new SqlUser());
        userMap.put("OracleUser", new OracleUser());
    }

    public static AbstractUser getUser(String type){
        return userMap.get(type);
    }
}

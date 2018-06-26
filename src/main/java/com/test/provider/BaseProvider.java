package com.test.provider;


import java.lang.reflect.InvocationTargetException;
/**
 * @author chenxing
 *         Created by ChenXing on 2018/6/25.
 */

public class BaseProvider {

    public String getAll()
            throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        String testDemoSql="select * FROM T_DOMAIN WHERE IS_DEL = 0";
        return testDemoSql;
    }
}

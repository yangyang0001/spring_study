package com.deepblue.spring_study_001_bean.spring_004_replaced;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MyRepalceMethodBean implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.err.println("this is new method invoke, that is MyRepalceMethodBean");
        return null;
    }
}

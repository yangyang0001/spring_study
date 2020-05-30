package com.deepblue.spring_study_001_bean.spring_003_lookup;

public class Student implements User {
    @Override
    public void showMe() {
        System.err.println("I am student");
    }
}

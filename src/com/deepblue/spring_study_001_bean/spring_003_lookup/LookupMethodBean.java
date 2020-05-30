package com.deepblue.spring_study_001_bean.spring_003_lookup;

public abstract class LookupMethodBean {

    public void showMe() {
        getUserBean().showMe();
    }

    public abstract User getUserBean();

}

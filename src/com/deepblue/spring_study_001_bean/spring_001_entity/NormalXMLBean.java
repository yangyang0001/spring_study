package com.deepblue.spring_study_001_bean.spring_001_entity;

import java.io.Serializable;

public class NormalXMLBean implements Serializable {

    private static final long serialVersionUID = 830151048795810221L;

    private String name = "YangJianWei";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

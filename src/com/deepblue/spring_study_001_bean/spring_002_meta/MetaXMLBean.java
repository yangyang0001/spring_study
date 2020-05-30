package com.deepblue.spring_study_001_bean.spring_002_meta;

import java.io.Serializable;

public class MetaXMLBean implements Serializable {

    private static final long serialVersionUID = 1756841427334268465L;

    private String name = "YANGJIANWEI";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

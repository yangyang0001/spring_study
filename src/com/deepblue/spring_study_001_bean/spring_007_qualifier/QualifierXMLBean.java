package com.deepblue.spring_study_001_bean.spring_007_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("qf")
public class QualifierXMLBean {

    private String qualifierName = "QF";

    public String getQualifierName() {
        return qualifierName;
    }

    public void setQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
    }
}

package com.deepblue.spring_study_001_bean.spring_005_constructs;

import java.io.Serializable;

public class ConstructXMLBean implements Serializable {

    private static final long serialVersionUID = -1854945337794539754L;

    private String username;
    private String password;

    public ConstructXMLBean() {}

    public ConstructXMLBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

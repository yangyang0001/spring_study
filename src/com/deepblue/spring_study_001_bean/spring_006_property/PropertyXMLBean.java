package com.deepblue.spring_study_001_bean.spring_006_property;

import java.io.Serializable;
import java.util.List;

public class PropertyXMLBean implements Serializable {

    private String username;
    private Integer age;
    private Boolean isChinese;
    private String[] hobbies;
    private List<String> parents;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsChinese() {
        return isChinese;
    }

    public void setIsChinese(Boolean isChinese) {
        this.isChinese = isChinese;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }
}

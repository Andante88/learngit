package com.qcm;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;
    @Required
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Required
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

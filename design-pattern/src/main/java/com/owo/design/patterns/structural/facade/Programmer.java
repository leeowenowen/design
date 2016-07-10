package com.owo.design.patterns.structural.facade;

/**
 * Created by wangli on 16-7-10.
 */
public class Programmer {
    private String name;
    private String gender;
    private int age;
    private String languageGoodAt;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguageGoodAt() {
        return languageGoodAt;
    }

    public void setLanguageGoodAt(String languageGoodAt) {
        this.languageGoodAt = languageGoodAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

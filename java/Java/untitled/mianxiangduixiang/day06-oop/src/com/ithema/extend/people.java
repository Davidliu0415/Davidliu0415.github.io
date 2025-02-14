package com.ithema.extend;
//father class
//继承的好处: 子类可以拥有父类的属性和方法
public class people {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private String name;
    private char gender;
}


package com.ithema.extend;

public class test {
    public static void main(String[] args) {
        //目标:认识继承,好处,使用方法
        //封装老师数据
        //子类可以继承父类的非私有属性和方法
        teacher t= new teacher();
        t.setName("小红");
        t.setSkill("java,大数据");
        t.setGender('m');
        System.out.println(t.getName()+t.getSkill()+t.getGender());

    }
}

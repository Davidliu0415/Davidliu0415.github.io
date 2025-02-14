package com.xmum.capsulation;

public class test {
    public static void main(String[] args) {
        //目标:搞清楚封装的设计思想:封装就是将属性私有化,通过方法访问
        student s1 = new student();
        s1.setAge(18);
        System.out.println(s1.getAge());
    }
}

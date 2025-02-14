package com.xmum.constructor;

public class test {
    public static void main(String[] args) {
        //目标:认识类的构造器,搞清楚其特点与引用场景
        //构造器特点:创建对象时,对象会自动调用构造器
        student s1 = new student();
        //创建对象时可以立即为对象赋值
        student s2 = new student("小明",18,'男');
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
    }
}

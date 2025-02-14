package com.xmum.constructor;

public class student {
    String name;
    int age;
    char sex;

    //无参数构造器
    //是一种特殊方法,不能写返回值类型,不能有返回值,方法名必须和类名一样
    public student(){
        System.out.println("无参数构造器");
    }
    //2.有参数构造器
    //如果定义了有参数构造器,编译器就不会提供无参数构造器了,需要从新加入
    public student(String n,int a,char s){
        System.out.println("有参数构造器");
        name=n;
        age=a;
        sex=s;
    }
}

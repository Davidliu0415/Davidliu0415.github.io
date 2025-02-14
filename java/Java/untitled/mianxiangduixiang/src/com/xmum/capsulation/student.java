package com.xmum.capsulation;

public class student {
    String name;
    //1.如何隐藏,使用private关键字修饰成员变量,就只能在本类中被直接访问.
    private int age;
    //2.如何暴露成员变量,使用public关键字修饰成员变量,就可以在任意类中直接访问.get与set方法.
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
    }
    public int getAge() {
        return age;
    }
    double chinese;
    double math;

}

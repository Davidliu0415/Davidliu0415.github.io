package com.xmum.thisdemo;

public class test {
    public static void main(String[] args) {
        //目标:this关键字的使用
        student s1 = new student();
        s1.print();
        System.out.println(s1);
        System.out.println("==================");
        student s2 = new student();
        s2.print();
        System.out.println(s2);

        student s3 = new student();
        s3.name="小明";
        s3.printhobby("XIAOHONG");
    }
}

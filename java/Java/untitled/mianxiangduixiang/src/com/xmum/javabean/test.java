package com.xmum.javabean;

public class test {
    public static void main(String[] args) {
        //实体类的基本作用:创建他的对象,存取数据
        student s2=new student("zheng",100,100);
        student s1=new student("liu",100,200);
        //实体类在开发中的应用场景
        //创建一个学生的操作对象
        studentoperater so=new studentoperater(s1);
        so.printtatol();
        so.print2();
    }


}

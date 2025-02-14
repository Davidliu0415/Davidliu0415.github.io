package com.xmum.thisdemo;

public class student {
    String name;
    public void print(){
        //this是一个变量,用在方法中,用于拿到当前对象
        //哪个对象调用这个,this就拿到哪个对象
        System.out.println(this);
    }
    public void printhobby(String name){
        System.out.println(this.name +name);
    }
}

package com.xmum.javabean;

public class studentoperater {
    //必须拿到学生对象
    private student s;//用于记住将来要操作的对象
    public studentoperater(student s)
    {
        this.s=s;
    }

    //提供方法:打印学生对象总成绩
    public void printtatol() {
        System.out.println(s.getChinese() + s.getMath());

    }
    //提供方法:打印学生对象平均成绩
    public void print2()
    {
        System.out.println((s.getChinese()+s.getMath())/2);

    }
}

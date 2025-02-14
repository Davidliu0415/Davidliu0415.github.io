package com.xmum.javabean;
//固定格式
public class student {
    private String name;
    private double chinese;//语文成绩
    private double math;//数学成绩
    //2.公开get与set
    //无参构造器

    public student() {
    }
    //可选提供一个有参构造器
   public student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}

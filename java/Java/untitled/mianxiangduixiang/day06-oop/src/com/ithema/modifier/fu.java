package com.ithema.modifier;

public class fu {
    //1.private 只能当前类访问
    private void privatemethod(){
        System.out.println("我是private方法");
    }
    //2.缺省,默认,当前类,子类,同一个包中都可以访问
    void method(){
        System.out.println("我是默认方法");
    }
    //3.protected 当前类,子类,同一个包中都可以访问,子类的子类
    protected void protectedmethod(){
        System.out.println("我是protected方法");
    }
    //4.public 当前类,子类,同一个包中都可以访问,子类的子类,不同包的类,任何类都可以访问.
    public void publicmethod(){
        System.out.println("我是public方法");
    }

    public static void main(String[] args) {
        fu f = new fu();
        f.method();
        f.privatemethod();
        f.protectedmethod();
        f.publicmethod();
    }
}

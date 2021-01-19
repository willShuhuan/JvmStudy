package com.dsh.thingkinginjava.Initializationtest;


/**
 * @author dongshuhuan
 * date 2019/6/13
 * version
 */
public class Class  {
    String s;
    public Class(int i){
        System.out.println("init s = "+i);
        Class2 c = new Class2();
        c.print();
        System.out.println(c+"aaaa");
    }

    protected void m1(){

    }

    public static void m2(){

    }

    public final void m3(){
        System.out.println("fianl方法不能被子类覆盖");
    }

    private final void m4(){
        System.out.println("私有fianl方法不能被调用");
    }

    protected Class(){}


}

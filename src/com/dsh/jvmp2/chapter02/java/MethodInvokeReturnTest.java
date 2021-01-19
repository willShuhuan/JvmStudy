package com.dsh.jvmp2.chapter02.java;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-09-08 9:35
 *
 * 指令5：方法调用与返回指令
 */
public class MethodInvokeReturnTest {

    //方法调用指令:invokespecial:静态分派
    public void invoke1(){
        //情况1：类实例构造器方法：<init>()
        Date date = new Date();

        Thread t1 = new Thread();
        //情况2：父类的方法
        super.toString();
        //情况3：私有方法
        methodPrivate();
    }

    private void methodPrivate(){

    }
    //方法调用指令:invokestatic:静态分派
    public void invoke2(){
        methodStatic();
    }
    public static void methodStatic(){

    }

    //方法调用指令:invokeinterface
    public void invoke3(){
        Thread t1 = new Thread();
        ((Runnable)t1).run();

        Comparable<Integer> com = null;
        com.compareTo(123);
    }

    //方法调用指令:invokeVirtual:动态分派
    public void invoke4(){
        System.out.println("hello");

        Thread t1 = null;
        t1.run();
    }
    //方法的返回指令
    public int returnInt(){
        int i = 500;
        return i;
    }

    public double returnDouble(){
        return 0.0;
    }

    public String returnString(){
        return "hello,world";
    }

    public int[] returnArr(){
        return null;
    }

    public float returnFloat(){
        int i = 10;
        return i;
    }

    public byte returnByte(){
        return 0;
    }

    public void methodReturn(){
        int i = returnByte();
    }

}



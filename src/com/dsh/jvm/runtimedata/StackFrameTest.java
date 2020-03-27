package com.dsh.jvm.runtimedata;

/**
 * 栈帧
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest test = new StackFrameTest();
        test.method1();
        //输出 method1（）和method2（）都作为当前栈帧出现了两次，method3（）一次
//        method1()开始执行。。。
//        method2()开始执行。。。
//        method3()开始执行。。。
//        method3()执行结束。。。
//        method2()执行结束。。。
//        method1()执行结束。。。
    }

    public void method1(){
        System.out.println("method1()开始执行。。。");
        method2();
        System.out.println("method1()执行结束。。。");
    }

    public int method2(){
        System.out.println("method2()开始执行。。。");
        int i = 10;
        int m = (int) method3();
        System.out.println("method2()执行结束。。。");
        return i+m;
    }

    public double method3(){
        System.out.println("method3()开始执行。。。");
        double j = 20.0;
        System.out.println("method3()执行结束。。。");
        return j;
    }

}

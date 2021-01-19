package com.dsh.jvmp2.chapter03.java;

/**
 * 哪些场景下，java编译器就不会生成<clinit>()方法
 */
public class InitializationTest1 {
    //场景1：对应非静态的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
    public int num = 1;
    //场景2：静态的字段，没有显式的赋值，不会生成<clinit>()方法
    public static int num1;
    //场景3：比如对于声明为static final的基本数据类型的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
    public static final int num2 = 1;
    //不加final的变量会生成clinit
    public static  int num3 = 1;
}

package com.dsh.jvm.classloader;

/**
 * 类的初始化 clinit
 */
public class ClassInitTest {
    //任何一个类声明以后，内部至少存在一个类的构造器
    private int a = 1;
//    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }

    public ClassInitTest(){
        a = 10;
        int d = 20;
    }

    //    private static int num = 1;
//
//    static{
//        num = 2;
//        number = 20;//可以赋值
//        System.out.println(num);
//        System.out.println(number);//报错 ：非法前向引用，不能调用
//    }
//
//    private static int number = 10;//linking之prepare number =0；-->initial:覆盖 20 -->10
//
//    public static void main(String[] args) {
//        System.out.println(ClassInitTest.num);//2
//        System.out.println(ClassInitTest.number);//10
//    }

}

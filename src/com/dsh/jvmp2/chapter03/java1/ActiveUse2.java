package com.dsh.jvmp2.chapter03.java1;

import org.junit.Test;

import java.util.Random;

/**
 *
 * 3. 当使用类、接口的静态字段时(final修饰特殊考虑)，比如，使用getstatic或者putstatic指令。（对应访问变量、赋值变量操作）
 *
 */
public class ActiveUse2 {
    @Test
    public void test1(){
//        System.out.println(User.num);//类初始化了   num是变量
//        System.out.println(User.num1);//类没有初始化 num1是静态常量
        System.out.println(User.num2); //类初始化了 num2不是字面量方式声明的，需要方法调用，编译期间无法确定
    }

    @Test
    public void test2(){
//        System.out.println(CompareA.NUM1);//接口不需要初始化
        System.out.println(CompareA.NUM2);//接口需要初始化
    }
}

class User{
    static{
        System.out.println("User类的初始化过程");
    }

    public static int num = 1;
    public static final int num1 = 1;
    public static final int num2 = new Random().nextInt(10);

}

interface CompareA{
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareA的初始化");
        }
    };

    public static final int NUM1 = 1;
    public static final int NUM2 = new Random().nextInt(10);

}
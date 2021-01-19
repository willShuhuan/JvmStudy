package com.dsh.jvmp2.chapter03.java1;

import org.junit.Test;

import java.util.Random;

public class PassiveUse2 {
    /**
     * 3. 引用常量不会触发此类或接口的初始化。因为常量在链接阶段就已经被显式赋值了。
     */
    @Test
    public void test1(){
//        System.out.println(Person.NUM);// 不会触发Person类的初始化
        System.out.println(Person.NUM1);// 触发了Person类的初始化
    }

    @Test
    public void test2(){
//        System.out.println(SerialA.ID);//接口同理 使用SerialA.ID不会触发SerialA的初始化
        System.out.println(SerialA.ID1);//接口同理 ID1会触发SerialA的初始化
    }

    /**
     * 4. 调用ClassLoader类的loadClass()方法加载一个类，并不是对类的主动使用，不会导致类的初始化。
     */
    @Test
    public void test3(){
        try {
            //不会触发Person类的初始化，被动使用
            Class clazz = ClassLoader.getSystemClassLoader().loadClass("com.dsh.jvmp2.chapter03.java1.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Person{
    static{
        System.out.println("Person类的初始化");
    }
    public static final int NUM = 1;//在链接过程的准备环节就被赋值为1了。
    public static final int NUM1 = new Random().nextInt(10);//此时的赋值操作需要在<clinit>()中执行
}

interface SerialA{
    public static final Thread t = new Thread() {
        {
            System.out.println("SerialA的初始化");
        }
    };

    int ID = 1;
    int ID1 = new Random().nextInt(10);//此时的赋值操作需要在<clinit>()中执行
}


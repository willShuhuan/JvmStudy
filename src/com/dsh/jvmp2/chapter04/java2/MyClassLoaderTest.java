package com.dsh.jvmp2.chapter04.java2;

/**
 * @author shkstart
 * @create 15:20
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("/Users/dongshuhuan/JavaProjects/JVM_study/src/com/dsh/jvmp2/chapter04/java1/");

        try {
            Class clazz = loader.loadClass("Demo1");
            System.out.println("加载此类的类的加载器为：" + clazz.getClassLoader().getClass().getName());//com.dsh.jvmp2.chapter04.java2.MyClassLoader

            System.out.println("加载当前Demo1类的类的加载器的父类加载器为：" + clazz.getClassLoader().getParent().getClass().getName());//sun.misc.Launcher$AppClassLoader
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

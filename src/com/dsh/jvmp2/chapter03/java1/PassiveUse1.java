package com.dsh.jvmp2.chapter03.java1;

import org.junit.Test;

/**
 *
 * 关于类的被动使用，即不会进行类的初始化操作，即不会调用<clinit>()
 * 说明：没有初始化的类，不意味着没有加载！
 */
public class PassiveUse1 {
    /**
     * 1. 当访问一个静态字段时，只有真正声明这个字段的类才会被初始化。
     *    > 当通过子类引用父类的静态变量，不会导致子类初始化
     */
    @Test
    public void test1(){
        System.out.println(Child.num);
        //输出情况
        //Parent的初始化过程  -> 子类不需要初始化
        //1
    }

    /**
     * 2. 通过数组定义类引用，不会触发此类的初始化
     */
    @Test
    public void test2(){
        Parent[] parents = new Parent[10];//不打印 —> 没有初始化，运行时才会加载进来
        System.out.println(parents.getClass());//class [Lcom.dsh.jvmp2.chapter03.java1.Parent;
        System.out.println(parents.getClass().getSuperclass());//class java.lang.Object
        parents[0] = new Parent();//Parent的初始化过程    -> 类初始化
        parents[1] = new Parent();//不打印 -> 类已经初始化过了
    }
}

class Parent{
    static{
        System.out.println("Parent的初始化过程");
    }

    public static int num = 1;
}

class Child extends Parent{
    static{
        System.out.println("Child的初始化过程");
    }
}

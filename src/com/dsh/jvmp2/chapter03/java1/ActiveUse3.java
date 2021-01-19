package com.dsh.jvmp2.chapter03.java1;

import org.junit.Test;

import java.util.Random;

/**
 * 类的主动使用其他情况
 * 8. 当初次调用 MethodHandle 实例时，初始化该 MethodHandle 指向的方法所在的类。
 * （涉及解析REF_getStatic、REF_putStatic、REF_invokeStatic方法句柄对应的类）
 */
public class ActiveUse3 {
    static{
        System.out.println("ActiveUse3的初始化过程");
    }

    //4、 当使用java.lang.reflect包中的方法反射类的方法时。比如：Class.forName("com.xxxx.xxx.Test")
    @Test
    public void test1() {
        try {
            Class clazz = Class.forName("com.dsh.jvmp2.chapter03.java1.Order");
            //输出语句
            //ActiveUse3的初始化过程
            //Order类的初始化过程
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //5、 当初始化子类时，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化。
    // 注意：
    // 当Java虚拟机初始化一个类时，要求它的所有父类都已经被初始化，但是这条规则并不适用于接口。
    // >在初始化一个类时，并不会先初始化它所实现的接口
    // >在初始化一个接口时，并不会先初始化它的父接口
    // 因此，一个父接口并不会因为它的子接口或者实现类的初始化而初始化。只有当程序首次使用特定接口的静态字段时，
    // 才会导致该接口的初始化。
    @Test
    public void test2() {
        System.out.println(Son.num);//接口CompareD不会初始化
        //依次输出
        //ActiveUse3的初始化过程
        //Father类的初始化过程
        //Son类的初始化过程
        //1
    }

    @Test
    public void test3(){
        System.out.println(CompareC.NUM1); //CompareC父接口CompareB并不会初始化
        //依次输出
        //ActiveUse3的初始化过程
        //CompareC的初始化  -> 子接口初始化了，但是父接口并没有初始化
        //2094196067
    }


    //6、 如果一个接口定义了default方法，那么直接实现或者间接实现该接口的类的初始化，该接口要在其之前被初始化。
    // 如果Son2还有子类，根据5,那么其子类的父类，父类的父类也都要被初始化
    @Test
    public void test4() {
        System.out.println(Son2.num);
        //依次输出
        //ActiveUse3的初始化过程
        //Father类的初始化过程
        //CompareB的初始化 -> CompareB接口定义了default方法，所以接口要初始化，注意区分与CompareD的区别
        //Son2类的初始化过程
        //1
    }

    //7. 当虚拟机启动时，用户需要指定一个要执行的主类（包含main()方法的那个类），虚拟机会先初始化这个主类。
    public static void main(String[] args) {
        System.out.println("hello");
        //依次输出
        //ActiveUse3的初始化过程
        //hello
    }
}


class Father {
    static {
        System.out.println("Father类的初始化过程");
    }
}

class Son extends Father implements CompareD{
    static {
        System.out.println("Son类的初始化过程");
    }

    public static int num = 1;
}

class Son2 extends Father implements CompareB{
    static {
        System.out.println("Son2类的初始化过程");
    }

    public static int num = 1;
}

interface CompareB {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareB的初始化");
        }
    };
    public default void method1(){
        System.out.println("你好！");
    }
}

interface CompareC extends CompareB {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareC的初始化");
        }
    };

    public static final int NUM1 = new Random().nextInt();
}

interface CompareD {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareD的初始化");
        }
    };
}
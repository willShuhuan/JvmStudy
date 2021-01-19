package com.dsh.jvmp2.chapter03.java1;

import org.junit.Test;

import java.io.*;

/**
 *
 * 测试类的主动使用：意味着会调用类的<clinit>()，即执行了类的初始化阶段
 *
 * 1. 当创建一个类的实例时，比如使用new关键字，或者通过反射、克隆、反序列化。
 * 2. 当调用类的静态方法时，即当使用了字节码invokestatic指令。
 */
public class ActiveUse1 {
    public static void main(String[] args) {
        Order order = new Order();
    }

    //序列化的过程：
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order.dat"));

            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //反序列化的过程：（验证）
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("order.dat"));
            Order order = (Order) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test3(){
        Order.method();
    }

}

class Order implements Serializable{
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method(){
        System.out.println("Order method()....");
    }
}

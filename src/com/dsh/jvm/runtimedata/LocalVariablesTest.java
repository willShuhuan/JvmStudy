package com.dsh.jvm.runtimedata;

/**
 * 局部变量表
 */
public class LocalVariablesTest {

    private int count = 1;

    public static void testStatic(){
        //编译错误，因为this变量不存在与当前方法的局部变量表中！！！
//        System.out.println(this.count);
    }

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    private void test1() {
        int i = 20;
        System.out.println("test1");
        this.count = 2;
        test2();
    }

    private void test2() {
        int a = 0;
        {
            int b = 0;
            b = a+1;
        }
        //变量c使用之前以及经销毁的变量b占据的slot位置
        int c = a+1;
    }

}

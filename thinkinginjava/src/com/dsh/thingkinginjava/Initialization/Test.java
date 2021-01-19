package com.dsh.thingkinginjava.Initialization;

import java.util.Arrays;
import java.util.Random;
import com.dsh.thingkinginjava.Initializationtest.Class;
import com.dsh.thingkinginjava.Initializationtest.Class2;

/**
 * @author dongshuhuan
 * date 2019/6/13
 * version
 */
public class Test extends Class{

    public Test(int i) {
        super(i);
        //new Class();//不能访问非同一包下父类的protected实例方法
    }


    //可以访问从父类集成的protected方法
    @Override protected void m1() {
        super.m1();
    }

    ////可以写一个与父类同名的私有final方法
    //private final void m4(){
    //    System.out.println("fianl方法不能被子类覆盖");
    //}

    //可以写一个与父类私有final方法同名的方法，public或private都可以
    public final void m4(){
        System.out.println("fianl方法不能被子类覆盖");
    }

    public static void main(String[]args){

        Class c = new Class(5);
        Class.m2();
        c.m3();
        //whileDoWhile();
        //commaOperator();
        //forEachFloat();
        //forCharArray();
        //labeledWhile();
        //fib();
        Vampire();
        String[] s = new String[]{"a","b",};
        Integer i[] = new Integer[]{new Integer(1),new Integer(2),3};

        Class2 c2 = new Class2();
        //c2.print(); print()为包权限方法，不可以在包外调用
        System.out.println(c2+" append str");

    }

    //斐波那契数列
    private static void fib() {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 3;i<10;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c+"\t");
        }
    }

    /**
     * 吸血鬼数字,高效率版本.<br>
     * 一个4位数字，可以拆分2个2位数数字的乘积,顺序不限。<br>
     * 比如 1395 =15 * 93
     */
    public static void Vampire() {
            String[] ar_str1, ar_str2;
            int sum = 0;
            int from;
            int to;
            int i_val;
            int count = 0;
            // 双重循环穷举
            for (int i = 10; i < 100; i++) {
                // j=i+1避免重复
                from = Math.max(1000 / i, i + 1);
                to = Math.min(10000 / i, 100);
                for (int j = from; j < to; j++) {
                    i_val = i * j;
                    // 下面的这个代码，我个人并不知道为什么，汗颜
                    if (i_val % 100 == 0 || (i_val - i - j) % 9 != 0) {
                        continue;
                    }
                    count++;
                    ar_str1 = String.valueOf(i_val).split("");
                    ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                    Arrays.sort(ar_str1);
                    Arrays.sort(ar_str2);
                    if (Arrays.equals(ar_str1, ar_str2)) {// 排序后比较,为真则找到一组
                        sum++;
                        System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                    }
                }
            }
            System.out.println("共找到" + sum + "组吸血鬼数");
            System.out.println(count);

    }

    private static void labeledWhile() {
        int i = 0;
        outer:
        while (true){
            System.out.println("outer while loop");
            while (true){
                i++;
                System.out.println("i="+i);
                if (i==1){
                    System.out.println("continue");
                    continue ;
                }
                if (i==3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i==5){
                    System.out.println("break");
                    break  ;
                }
                if (i==7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }

    private static void forCharArray() {
        for (char c :"We are the Champion".toCharArray()){
            System.out.println(c);
        }
    }

    private static void forEachFloat() {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f){
            System.out.println(x);
        }
    }

    private static void commaOperator() {
        for (int i = 1,j = i+10;i<5;i++,j=i*2){
            System.out.println("i="+i + "  j="+j);
        }
    }

    private static void whileDoWhile() {
        int i = 5;
        do {
            i ++;
            System.out.println("TAGGG i = " + i);
        } while (i < 5);

        int j = 0;
        while (j < 5) {
            j ++;
            System.out.println("TAGGG j = " + j);
        }
    }
}

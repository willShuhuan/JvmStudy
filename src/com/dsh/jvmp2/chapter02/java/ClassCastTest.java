package com.dsh.jvmp2.chapter02.java;

import org.junit.Test;


/**
 * @author shkstart
 * @create 2020-09-08 0:11
 *
 * 指令3：类型转换指令
 */
public class ClassCastTest {
    //宽化类型转换

    //针对于宽化类型转换的基本测试
    public void upCast1(){
        int i  = 10;
        long l = i;
        float f = i;
        double d = i;

        float f1 = l;
        double d1 = l;

        double d2 = f1;
    }
    //举例：精度损失的问题
    @Test
    public void upCast2(){
        int i = 123123123;
        float f = i;
        System.out.println(f);//123123120

        long l = 123123123123L;
        l = 123123123123123123L;
        double d = l;
        System.out.println(d);//123123123123123120
    }
    //针对于byte、short等转换为容量大的类型时，将此类型看做int类型处理。
    public void upCast3(byte b){
        int i = b;
        long l = b;
        double d = b;
    }

    public void upCast4(short s){
        int i = s;
        long l = s;
        float f = s;
    }

    //窄化类型转换
    //基本的使用
    public void downCast1(){
        int i = 10;
        byte b = (byte)i;
        short s = (short)i;
        char c = (char)i;

        long l = 10L;
        int i1 = (int)l;
        byte b1 = (byte) l;


    }
    public void downCast2(){
        float f = 10;
        long l = (long)f;
        int i = (int)f;
        byte b = (byte)f;

        double d = 10;
        byte b1 = (byte)d;

    }

    public void downCast3(){
        short s = 10;
        byte b = (byte)s;
    }

    //窄化类型转换的精度损失
    @Test
    public void downCast4(){
        int i = 128;
        byte b = (byte)i;
        System.out.println(b);//-128
    }
    //测试NaN,无穷大的情况
    @Test
    public void downCast5(){
        double d1 = Double.NaN; //0.0 / 0.0
        int i = (int)d1;
        System.out.println(d1);//NaN
        System.out.println(i);//0 整型不存在NaN，按0处理

        double d2 = Double.POSITIVE_INFINITY;// Infinity
        long l = (long)d2;
        int j = (int)d2;
        System.out.println(l);//9223372036854775807  转换后指向了long型的最大值  Infinity -> 9223372036854775807
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(j);//2147483647 转换后指向了int型的最大值  Infinity -> 2147483647
        System.out.println(Integer.MAX_VALUE);//2147483647

        float f = (float)d2;
        System.out.println(f);//Infinity   float无穷大没有具体值

        float f1 = (float)d1;
        System.out.println(f1);//NaN
    }
}

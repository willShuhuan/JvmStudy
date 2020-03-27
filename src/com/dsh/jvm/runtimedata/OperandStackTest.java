package com.dsh.jvm.runtimedata;

/**
 * 操作数栈测试
 */
public class OperandStackTest {

    public void testAddOperation(){
        //byte short char boolean flaot: 都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i+j;
    }

    /**
     * 面试中常被问到的i++和++i的区别
     */
    public void add(){
        //第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第二类问题
        int i3 = 10;
        int i4 = i3++;//10

        int i5 = 10;
        int i6 = ++i5;//11

        // 第3类问题
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        //第4类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }


}

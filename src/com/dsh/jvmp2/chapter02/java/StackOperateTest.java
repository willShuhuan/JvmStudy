package com.dsh.jvmp2.chapter02.java;

/**
 * @author shkstart
 * @create 2020-09-08 10:13
 *
 * 指令6：操作数栈管理指令
 */
public class StackOperateTest {

    public void print(){
        Object obj = new Object();
        String info = obj.toString();
//        obj.toString();
    }
    //类似的
    public void foo(){
        bar();
    }

    public long bar(){
        return 0;
    }

    public long nextIndex() {
        return index++;
    }

    private long index = 0;
}

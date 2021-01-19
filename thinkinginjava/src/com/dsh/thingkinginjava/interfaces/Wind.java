package com.dsh.thingkinginjava.interfaces;

import java.util.Arrays;

/**
 * @author dongshuhuan
 * date 2019/7/5
 * version
 */
public class Wind implements Instrument {


    @Override public  void play() {
        System.out.println(toString()+"接口域i="+i);
        adjust();
    }

    @Override public void adjust() {
        Object ob = new Object();
        ob.toString();//Object的toString方法返回的是'类路径@哈希值'
        
        String s = "a b c d";
        String[] ss = s.split(" ");
        System.out.println(Arrays.toString(ss));

    }

    @Override public String toString() {
        return super.toString();
        //return this.getClass().getSimpleName();
    }
}

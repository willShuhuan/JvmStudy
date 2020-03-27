package com.dsh.jvm.nativeinterface;

/**
 * 本地方法
 */
public  class IHaveNatives {

    //abstract 没有方法体
//    public abstract void abstractMethod(int x);

    //native 和 abstract不能共存，native是有方法体的，由C语言来实现
    public native void Native1(int x);

    native static public long Native2();

    native synchronized private float Native3(Object o);

    native void Native4(int[] array) throws Exception;

}

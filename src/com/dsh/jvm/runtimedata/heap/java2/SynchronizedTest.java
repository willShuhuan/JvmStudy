package com.dsh.jvm.runtimedata.heap.java2;

/**
 * 同步省略说明
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
    //代码中对hollis这个对象进行加锁，但是hollis对象的生命周期只在f（）方法中，并不会被其他线程所访问控制，所以在JIT编译极端就会被优化掉。
    //优化为 ↓
    public void f2() {
        Object hollis = new Object();
        System.out.println(hollis);
    }
}

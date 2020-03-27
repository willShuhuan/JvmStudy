package com.dsh.jvm.classloader;

public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName()+"开始");
            DeadThread thread = new DeadThread();
            System.out.println(Thread.currentThread().getName()+"结束");
        };

        Thread thread1 = new Thread(runnable,"线程1");
        Thread thread2 = new Thread(runnable,"线程2");
        thread1.start();
        thread2.start();
    }

}

class DeadThread{
    static {
        if (true){
            System.out.println(Thread.currentThread().getName()+"初始化当前类");
            while (true){

            }
        }
    }
}

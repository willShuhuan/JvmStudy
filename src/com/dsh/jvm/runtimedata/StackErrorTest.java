package com.dsh.jvm.runtimedata;

/**
 * 演示栈中的异常
 *
 * 默认情况下：count 10818
 * 设置栈的大小： -Xss256k count 1872
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}

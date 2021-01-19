package com.dsh.jvmp2.chapter01.java1;

/**
 * @author shkstart
 * @create 2020-09-04 19:03
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);//[Ljava.lang.Object;@1540e19d

        String[] arr1 = new String[10];
        System.out.println(arr1);//[Ljava.lang.String;@677327b6

        long[][] arr2 = new long[10][];
        System.out.println(arr2);//[[J@14ae5a5
    }
}

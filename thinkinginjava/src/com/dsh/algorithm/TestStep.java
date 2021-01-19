package com.dsh.algorithm;

/**
 * @author DSH
 * @date 2020/11/28
 * @description
 */
public class TestStep {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        System.out.println(recursion(40));
        System.out.println(loop(40));
        long end = System.currentTimeMillis();
        System.out.println(end-start);//递归379ms 循环迭代打印0，实际1ms不到
    }

    //递归方式
    public static int recursion(int n){
        if (n<1){
            throw new IllegalArgumentException("参数值不能小于1");
        }
        if (n==1||n==2){
            return n;
        }
        return recursion(n-1)+recursion(n-2);
    }

    //循环迭代方式
    public static int loop(int n){
        if (n<1){
            throw new IllegalArgumentException("参数值不能小于1");
        }
        if (n==1||n==2){
            return n;
        }
        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;
        for (int i = 3; i < n; i++) {
            //最后跨2步 + 最后走1步的走法
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }

}

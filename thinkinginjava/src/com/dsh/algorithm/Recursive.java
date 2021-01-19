package com.dsh.algorithm;

import java.util.ArrayList;

/** 递归算法
 * @author dongshuhuan
 * date 2019/6/27
 * version
 */
public class Recursive {
    public static void main(String[] args) {

        //普通阶乘
        commonGetFactorial(5);
        //递归阶乘
        recursiveGetFactorial(6);
        //斐波那契数列
        fibonacciSequence(10);
        System.out.println(fibonacciSequence(10));

        //递归求和
        int[] arr = new int []{1,2,3,4,5,6};
        int sum1 = add(arr,arr.length-1);
        int sum2 = add2(arr,0);
        System.out.println(sum1);
        System.out.println(sum2);

        //寻找一组数的最大值
        int[] arr2 = new int []{1,35,23,45,1,24,6,30,9};
        int max = findMax(arr2,arr2.length-1);
        System.out.println(max);

    }

    /**
     * 递归查找一组数的最大值
     * 基线条件 当递归到第1个数时(第0个索引) 终止
     * 递归条件 用最后一个数（第n个）和前n-1个数的较大值
     * @param arr
     * @param endindex
     * @return
     */
    static int i = 0;
    public static int findMax(int[] arr,int endindex){
        //采用的递归思路是：若求长度为L的数组最大值，即是求 数组前n-1个元素的最大值 和最后一个数组元素的相对较大值
        if(endindex==0){
            i++;
            System.out.println("终止在第"+i+"次执行函数");
            return arr[0];
        }
        i++;
        System.out.println("正在执行第"+i+"次");
        return max(arr[endindex],findMax(arr,endindex-1));
        /**
         * 9：findMax（arr,7）        返回findMax
         * 30：findMax(arr,6)]        返回findMax
         * 6：findMax(arr,5)]         返回findMax
         * 24：findMax(arr,4)]        返回findMax
         * 1：findMax(arr,3)]         返回findMax
         * 45：findMax(arr,2)]        返回45:35 返回45
         *       |
         *       V
         * findMax(arr,2)]            返回 findMax
         * findMax(arr,1)]            返回 arr[1]:arr[0] 35
         */

    }

    private static int max(int a,int b){   //定义一个比较两个数值大小的函数
        return a>b?a:b;
    }

    /**
     * begin==arr.length 基线条件
     * a[begin] + { a[begin+1]...a[end] } 递归条件
     */
    private static int add2(int[] arr, int begin) {
        if (begin==arr.length){
            return 0;
        }else {
            int x = add2(arr,begin+1);
            return arr[begin]+x;
        }

    }

    /**
     * 递归求和
     * @param arr
     * @param end
     * @return
     */
    private static int add(int[] arr,int end) {
        if (end==-1) {
            return 0;
        }else {
            int x = add(arr,end-1);
            return arr[end]+x;
        }
         /**
           * 上面的递归一层层展开后大体是这样的：
           * { a[0] ... a[end-1] } + a[end] 递归条件
           * end==-1 基线条件
           *
           * arr[5] + add(arr,4)
           * arr[5] + arr[4] + add(arr,3)
           * arr[5] + arr[4] + arr[3] + add(arr,2)
           * arr[5] + arr[4] + arr[3] + arr[2] + add(arr,1)
           * arr[5] + arr[4] + arr[3] + arr[2] + arr[1] + add(arr,0)
           * arr[5] + arr[4] + arr[3] + arr[2] + arr[1] + arr[0] = 21;
           */
    }

    /** 1 1 2 3 5 8
     * 递归求斐波那契数列
     * @param n 第n个数
     */
    private static int fibonacciSequence(int n) {
        if (n<=2){
            return 1;
        }
        return fibonacciSequence(n-1)+fibonacciSequence(n-2);
    }

    /**
     * 递归求阶乘方法
     * @param n
     * @return
     */
    private static int recursiveGetFactorial(int n) {
        if (n>=0){
            if (n==0){
                return 1;
            }else {
                int temp = n*recursiveGetFactorial(n-1);
                System.out.println(n+"!="+temp);
                return temp;
            }
        }
        return -1;
    }

    /**
     * 普通求阶乘方法
     * @param n
     * @return
     */
    private static int commonGetFactorial(int n) {
        int temp = 1;
        if (n<0){
            return -1;
        }else {
            for (int i=1;i<=n;i++){
                temp = temp*i;
            }
            System.out.println("n!="+temp);
        }
        return temp;
    }
}

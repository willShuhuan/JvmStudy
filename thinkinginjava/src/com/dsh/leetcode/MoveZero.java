package com.dsh.leetcode;

import java.util.Arrays;

/**
 * LeetCode 283 移动0
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @author DSH
 * @date 2020/12/5
 * @description
 */
public class MoveZero {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
//        int[] newArr = moveZero(arr);
        int[] newArr = betterMoveZero(arr);
        System.out.println(Arrays.toString(newArr));
    }

    /**
     * 优化算法 方式3
     * @param arr
     * @return
     * 方式1 遍历0的个数，非零元素向前挪动，要写两个loop
     * 方式2 开一个新的数组，遍历源数组，0往后放 非0往前放 不符合题意，pass掉
     * 方式3 数组中index操作 j指向0元素 当找到0元素时，j固定位置，直到跟非0元素进行交换时j++,一次循环搞定
     */
    private static int[] betterMoveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[j] = arr[i];
                if (i!=j){
                    arr[i]=0;
                }
                j++;
            }
        }
        return arr;
    }

    /**
     * 笨方法，双层for循环，类似冒泡
     * @param arr
     * @return
     */
    private static int[] moveZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i];
                if (temp==0&&arr[j]!=0){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}

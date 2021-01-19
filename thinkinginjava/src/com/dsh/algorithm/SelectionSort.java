package com.dsh.algorithm;

/**选择排序
 * @author dongshuhuan
 * date 2019/6/26
 * version
 */
public class SelectionSort {
    public static void main(String[]args){
        int[] arr = {5,8,2,9,11,35,30,23};

        int temp = 0;//中间数，交换使用
        //外循环，遍历数组中的每个数
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int smallest_index = i;
            //内循环，第一次，将第一个数与剩下7个数进行比较，找出最小值的索引，以此类推
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<smallest){
                    smallest = arr[j];
                    smallest_index = j;
                }
            }
            //找到最小值的索引之后，将当前遍历的数和最小数进行位置交换，
            // 如5>2 则令中间数temp = arr[0],arr[0]=arr[2],arr[2]=temp=arr[0]
            temp = arr[i];
            arr[i] = arr[smallest_index];
            arr[smallest_index] = temp;
            //第一次遍历完成之后 数组变成了{2,8,5,9,11,35,30,23},以此类推，最后得出排序后的数组
        }

        for (int i:arr ){
            System.out.print(i+" ");
        }

        //选择排序运行时间O(n^2),实际为O(1/2*N^2),但是大O表示法省略诸如1/2这样的常数
    }
}

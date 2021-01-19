package com.dsh.algorithm;

/** 二分查找
 * @author dongshuhuan
 * date 2019/6/21
 * version
 */
public class BinarySearch {

    public int binary_search(int[] arr, int k){
       int low = 0;
       int hign = arr.length-1;
       int t = 0;
       while (low<=hign) {
            t++;
           int mid = (low+hign)/2;
           System.out.println("当前查找第"+(mid+1)+"个元素->"+arr[mid]);
           if (arr[mid] == k) {
               System.out.println("找到了，第"+(mid+1)+"个元素是我们找的数,查找了"+t+"次");
               return mid;
           }
           if (arr[mid] > k) {
               hign = mid - 1;
           }
           if (arr[mid] < k) {
               low = mid+1;
           }
       }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        System.out.println("查找元素位置在"+bs.binary_search(new int[]{1,2,3,4,5,6,7,8,9,10,11},5));
        System.out.println("查找元素位置在"+bs.binary_search(new int[]{1,3,5,7,9,11},9));
        System.out.println("查找元素位置在"+bs.binary_search(new int[]{},9));
    }

    /**
     * 二分查找，运行时间为O(log n),最多查找次数为log n
     */

}

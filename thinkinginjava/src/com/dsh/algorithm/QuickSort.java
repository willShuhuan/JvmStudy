package com.dsh.algorithm;

/** 快速排序
 * @author dongshuhuan
 * date 2019/6/28
 * version
 * 选择排序的运行时间O(n*logn)
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr2 = new int []{11,35,23,45,1,24,6,30,24};
        //在特定条件下，将数组的第一个元素作为基准线效率不高，这会让调用栈特别长（参考图解算法第55页）
        quickSort(arr2,0,arr2.length-1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("排序后数组-> "+i+"->"+arr2[i]);
        }

    }

    /**
     * 快速排序
     * @param arr2 数组
     * @param left 左边界
     * @param right 右边界
     */
    private static void quickSort(int[] arr2, int left, int right) {
        if (arr2.length<2||left>=right||arr2==null){
            return;
        }
        int pivot = partition(arr2,left,right);//先找出基准线索引
        System.out.println("基准线索引为=="+pivot);
        quickSort(arr2,left,pivot);//基准线左边进行排序
        quickSort(arr2,pivot+1,right);//基准线右边排序
    }

    private static int partition(int[] arr2, int left, int right) {
        int temp = arr2[left];                    //① temp = arr[0]=11;
        while (left<right){                        //② {6,35,23,45,1,24,35,30,24} L=1 R=5   ③ {6,1,23,45,23,24,35,30,24} L=2 R=3
            while (left<right&&temp<=arr2[right]){
                right--;//从右向左找一个小于temp的数                                           ③ 11<arr2[3](45) right=2,跳出
            }
                                                   // ① arr[6]<11, right = 6; ②  arr[4]<11,right = 4;

            // 当基准数大于了arr[right]，则填坑
            if (left < right) {
                arr2[left] = arr2[right];          //① arr[0] = a[6]=6; ② arr[1] = arr[4] = 1;
                left++;                            //① left = 1；       ② left = 2；
            }
            //从左向右找一个大于temp的数
            while (left<right&&temp>=arr2[left]){
                left++;
            }

            //当基准数大于temp的时候 arr[right]填坑
            if (left<right){
                arr2[right]=arr2[left];             //① arr[6] = arr[1]=35; ② arr[4]=arr[2]=23;
                right--;                            //① right = 5;          ② right = 3；
            }

        }
        arr2[left] = temp;     //left = 2；{6,1,11,45,23,24,35,30,24}，这里可以看出我们当以数组第0个数即11为基准数时，
                                //找出其索引为2时，其前方的数比他小，后方的数比他大，从而实现分而治之的目的
        for (int i = 0; i < arr2.length; i++) {
            //System.out.println("找到基准线之后的数组为-> "+i+"->"+arr2[i]);
        }
        return left;

    }
}

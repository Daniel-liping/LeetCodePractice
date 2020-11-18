package com.lp.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TenSort {

    public static void main(String[] args) {
        int[] ints = new int[]{3,44,5,27,2,50,48,32,22,44,};
//        bubbleSort(ints);
//        selectionSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(String.format("**********ints[%s]: %s",i, ints[i]));
        }
    }

    /**
     * 冒泡排序：
     * 1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3、针对所有的元素重复以上的步骤，除了最后一个。
     * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param ints
     * @return
     */
    private static int[] bubbleSort(int[] ints){
        if (ints==null || ints.length==0){
            return null;
        }
        for (int i = 0; i < ints.length-1; i++) {
            for(int j=0; j<ints.length-i-1; j++){
                if(ints[j]>ints[j+1]){// 判断大小
                    int tmp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = tmp;
                }
            }
        }
        return ints;
    }

    /**
     * 选择排序：
     * 1、在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * 2、从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾
     * 3、以此类推，直到所有元素均排序完毕
     * @param ints
     * @return
     */
    private static int[] selectionSort(int[] ints){
        if (ints==null || ints.length==0){
            return null;
        }
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = i; j < ints.length; j++) {
//                if (ints[i]>ints[j]){
//                    int tmp = ints[i];
//                    ints[i] = ints[j];
//                    ints[j] = tmp;
//                }
//            }
//        }
        int minIndex = 0;
        int tmp = 0;
        for (int i = 0; i < ints.length; i++) {
            int minInt = ints[i];
            for (int j = i; j < ints.length; j++) {
                if (minInt>=ints[j]){// 寻找最小的数
                    minIndex = j;
                    minInt = ints[j];// 将最小的数的下标进行保存
                }
            }
            tmp = ints[i];
            ints[i] = ints[minIndex];
            ints[minIndex] = tmp;
        }
        return ints;
    }

    /**
     * 插入排序
     * 1、从第一个元素开始，该元素可以认为已经被排序
     * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5、将新元素插入到该位置后
     * 6、重复步骤2~5
     * @param ints
     * @return
     */
    private static int[] insertSort(int[] ints){
        if (ints==null || ints.length==0){
            return null;
        }


        return ints;
    }

}

package main.java.com.study.sort;

import java.util.Arrays;

/**
 * @Package: main.java.com.study.sort
 * @ClassName: BubbleSort
 * @Author: guanyushen
 * @Description: 冒泡排序算法
 * @Date: 2019/8/6 15:16
 */

public class BubbleSort {

    public static int[] bubbleSort(int[] a){
        for (int i = a.length-1;i>0;i--){
            boolean flag = true;
            int temp;
            for (int j = 0;j<i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int a[] = new int[100];
        for (int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}

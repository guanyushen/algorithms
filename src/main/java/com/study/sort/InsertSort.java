package main.java.com.study.sort;

import java.util.Arrays;

/**
 * @Package: main.java.com.study.sort
 * @ClassName: InsertSort
 * @Author: guanyushen
 * @Description: 插入排序算法
 * @Date: 2019/9/17 14:38
 */

public class InsertSort {

    public static int[] insertSort(int[] a){

        if(a.length == 1) return a;
        for (int i=1;i<a.length;i++){
            int temp = a[i];
            int j;
            for (j=i-1;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
        return a;
    }

    public static void main(String[] args) {

        int a[] = new int[10];
        for (int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(insertSort(a)));
    }
}

package main.java.com.study.sort;

import java.util.Arrays;

/**
 * @Package: main.java.com.study.sort
 * @ClassName: SelectSort
 * @Author: guanyushen
 * @Description: 选择排序（升序）
 * @Date: 2019/8/6 17:05
 */

public class SelectSort {

    public static int[] selectSort(int[] a){

        for(int i=0;i<a.length-1;i++){
            int temp = a[i];
            int minSize = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<temp){
                    minSize = j;
                    temp = a[j];
                }
            }
            a[minSize] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        int a[] = new int[10];
        for (int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(selectSort(a)));
    }
}

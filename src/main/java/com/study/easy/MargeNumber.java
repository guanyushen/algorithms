package com.study.easy;

import java.util.Arrays;

/**
 * 题目:合并两个有序数组
 *
 * @author guanyushen
 * @date 2019/7/26 23:41
 */

public class MargeNumber {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }

}

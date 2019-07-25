package com.study.easy;

/**
 * 题目:搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * @author guanyushen
 * @date 2019/7/25 21:17
 */

public class SearchLocation {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        if(start > end){
            return start;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}

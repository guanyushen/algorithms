package com.study.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目: 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。
 * @author guanyushen
 * @date 2019/7/12 20:09
 */

public class Solution {

    public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        throw new IllegalAccessException("找不到这样的组合!");
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] temp = twoSum(nums,target);
        System.out.println(Arrays.toString(temp));
    }
}

package com.study.easy;

import java.util.HashSet;

/**
 * 题目:只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author guanyushen
 * @date 2019/7/24 22:34
 */

public class SingleTonNumber {

    public static int singleNumber(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hashSet.add(nums[i]))
                hashSet.remove(nums[i]);
        }
        if(hashSet.size()==1){
            for (int i : hashSet){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}

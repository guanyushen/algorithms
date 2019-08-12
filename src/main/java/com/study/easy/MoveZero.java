package main.java.com.study.easy;

import java.util.Arrays;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: MoveZero
 * @Author: guanyushen
 * @Description: 题目:移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @Date: 2019/8/12 10:07
 */

public class MoveZero {

    /*public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                swapArrays(nums,i,k++);
            }
        }
    }
    private static void swapArrays(int[] nums,int first,int second){
        if(first == second){
            return;
        }
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }*/

    public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int p = k; p < nums.length; p++){
            nums[p] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

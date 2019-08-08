package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: SumArrayMax
 * @Author: guanyushen
 * @Description: 题目:最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组
 * （子数组最少包含一个元素），返回其最大和。
 * @Date: 2019/8/8 17:29
 */

public class SumArrayMax {

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

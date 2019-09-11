package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: Rob
 * @Author: guanyushen
 * @Description: 题目：打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是
 * 相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，
 * 能够偷窃到的最高金额。
 * @Date: 2019/9/1 19:07
 */

public class Rob {

    public static int rob(int[] num) {
        int currMax = 0,preMax = 0;
        for (int x:num){
            int temp = currMax;
            currMax = Math.max(preMax+x,currMax);
            preMax = temp;
        }
        return currMax;
    }

    public static void main(String[] args) {

        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}

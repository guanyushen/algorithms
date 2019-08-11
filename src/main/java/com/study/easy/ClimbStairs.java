package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: ClimbStairs
 * @Author: guanyushen
 * @Description: 题目:爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * @Date: 2019/8/10 14:45
 */

public class ClimbStairs {

    public static int climbStairs(int n) {

        if(n == 1)return 1;
        int first = 1,second = 2;
        for(int i=3;i<=n;i++){
            int three = first+second;
            first = second;
            second = three;
        }
        return second;
    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println(climbStairs(n));
    }
}

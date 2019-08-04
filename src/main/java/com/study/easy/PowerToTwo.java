package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: PowerToTwo
 * @Author: guanyushen
 * @Description: 题目:2的幂
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * @Date: 2019/7/31 19:53
 */

public class PowerToTwo {


    public static boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        while(n%2 == 0 && n != 0){
            n = n/2;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 256;
        System.out.println("结果:"+isPowerOfTwo(n));
    }

}

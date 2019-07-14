package com.study.easy;

/**
 * 题目:回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）
 * 和倒序（从右向左）读都是一样的整数。
 * @author guanyushen
 * @date 2019/7/14 21:24
 */

public class Plalindrome {

    public static boolean isPalindrome(int x) {

        if(x<0 || ( x % 10 == 0 && x != 0)) return false;
        int plalindrome = 0;
        while( x > plalindrome ){
            plalindrome = plalindrome*10 + x%10;
            x = x/10;
        }

        return x == plalindrome || x == plalindrome/10;
    }

    public static void main(String[] args) {

        int x = 123454321;
        System.out.println("回文数是:"+x+"\n结果:"+isPalindrome(x));
    }

}

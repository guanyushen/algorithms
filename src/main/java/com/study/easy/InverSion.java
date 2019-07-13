package com.study.easy;

/**
 * 题目:
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author guanyushen
 * @date 2019/7/13 21:20
 */

public class InverSion {

    public static int resulterse(int x) {
        int result = 0;
        boolean positive = true;
        if(x<0){
            x = Math.abs(x);
            positive = false;
        }
        while(x>0){
            int temp = x%10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result*10+temp;
            x = x/10;
        }
        if(!positive){
            result = 0-result;
        }
        return result;
    }

    public static void main(String[] args) {
        int test = (int)(Math.random()*10000);
        System.out.println("反转前:"+test);
        System.out.println("反转后:"+resulterse(test));
    }

}

package main.java.com.study.easy;

import java.util.HashSet;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: HappyNumber
 * @Author: guanyushen
 * @Description: 题目：快乐数
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，
 * 那么这个数就是快乐数。
 * @Date: 2019/9/11 15:06
 */

public class HappyNumber {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        int temp = 0;
        while (true){
            while (n>0){
                temp += Math.pow(n%10,2);
                n = n/10;
            }
            if(temp == 1){
                return true;
            }
            if(set.contains(temp)){
                return false;
            }else{
                set.add(temp);
                n = temp;
                temp = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}

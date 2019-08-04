package com.study.easy;

/**
 * 题目:宝石与石头
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，
 * 因此"a"和"A"是不同类型的石头。
 * @author guanyushen
 * @date 2019/8/4 13:15
 */

public class SumJewelsInStones {

    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int i=0;i<S.length();i++){
            String temp = S.substring(i, i+1);
            if(J.indexOf(temp) != -1){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
       String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}

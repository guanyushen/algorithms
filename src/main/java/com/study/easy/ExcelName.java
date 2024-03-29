package com.study.easy;

/**
 * 题目:Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * 例如，
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 * @author guanyushen
 * @date 2019/7/27 22:29
 */

public class ExcelName {

    public static String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();

        while(n>0){
            int k=n%26;
            if(k==0){
                n-=26;
                k=26;
            }

            char c = (char)((k-1) +(int)'A');
            sb.insert(0,c);
            n = n/26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int n = 66;
        System.out.println(convertToTitle(n));
    }
}

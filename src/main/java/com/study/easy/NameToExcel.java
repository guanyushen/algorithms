package com.study.easy;

/**
 * 题目:Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 例如，
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 * @author guanyushen
 * @date 2019/7/29 21:59
 */

public class NameToExcel {

    public static int titleToNumber(String s) {

        int sum = 0;
        for (int i=0;i<s.length();i++){
            int n = s.charAt(i) - 'A'+1;
            sum = sum*26+n;
        }
        return sum;
    }

    public static void main(String[] args) {

        String s = "ZY";
        System.out.println(titleToNumber(s));
    }
}

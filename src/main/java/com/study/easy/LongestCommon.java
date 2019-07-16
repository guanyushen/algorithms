package com.study.easy;

import java.util.Arrays;

/**
 * 题目:最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 * @author guanyushen
 * @date 2019/7/16 19:50
 */

public class LongestCommon {

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null) return "";
        String temp = strs[0];
        for (int i = 1;i<strs.length;i++){
            while (strs[i].indexOf(temp) != 0){
                temp = temp.substring(0,  temp.length()-1);
                if(temp.isEmpty()) return "";
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        String[] strings = {"flower","flow","flight"};
        System.out.println("字符串:"+ Arrays.toString(strings));
        System.out.println("公共前缀:"+longestCommonPrefix(strings));
    }
}

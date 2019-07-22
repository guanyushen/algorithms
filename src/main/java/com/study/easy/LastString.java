package com.study.easy;

/**
 * 题目:最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * @author guanyushen
 * @date 2019/7/22 21:39
 */

public class LastString {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int start = s.lastIndexOf(" ");
        if(start == -1) return s.length();
        String temp = s.substring(start, s.length()-1);
        return temp.length();
    }

    public static void main(String[] args) {

        String s = "hello world   ";
        System.out.println(lengthOfLastWord(s));
    }
}

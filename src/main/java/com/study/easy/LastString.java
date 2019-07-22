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
        int end = s.length()-1;
        while(end >0 && s.charAt(end) == ' ') end--;
        if(end == 0) return 0;
        int start = end;
        while (start >0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}

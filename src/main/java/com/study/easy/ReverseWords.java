package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: ReverseWords
 * @Author: guanyushen
 * @Description: 题目:反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * @Date: 2019/8/14 16:00
 */

public class ReverseWords {

    public static String reverseWords(String s) {

        StringBuffer resutlt = new StringBuffer();
        String[] ss = s.split(" ");
        for (int i=0;i<ss.length;i++){
            StringBuffer temp = new StringBuffer();
            temp.append(ss[i]);
            resutlt.append(temp.reverse().toString()).append(" ");
        }
        return resutlt.substring(0,resutlt.length()-1);
    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}

package main.java.com.study.easy;

/**
 * @Author: guanys@belink.com
 * @version: V1.0
 * @Package: main.java.com.study.easy
 * @ClassName: Isomorphic
 * @Description: 题目：同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。
 * 两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * @Date: 2019/10/10 9:21
 */

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.indexOf(ch1[i]) != t.indexOf(ch2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "egg",t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}

package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: LowerCase
 * @Author: guanyushen
 * @Description: 题目:转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * @Date: 2019/8/6 9:38
 */

public class LowerCase {

    public static String toLowerCase(String str) {

        StringBuffer s = new StringBuffer();
        for (int i = 0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp>='A' && temp<='Z'){
                temp +=32;
            }
            s.append(temp);
        }
        return s.toString();
    }

    public static void main(String[] args) {

        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
}

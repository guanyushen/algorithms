package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: NewPalindrome
 * @Author: guanyushen
 * @Description: 题目:验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * @Date: 2019/8/20 9:08
 */

public class NewPalindrome {

    public static boolean isPalindrome(String s){
        int len = s.length();
        //转为小写
        s = s.toLowerCase();
        int i = 0;
        int j = len-1;
        while (i<j){
            //过滤字符串中的非字母和非数字
            while (!isAlphanumeric(s.charAt(i))){
                i++;
                if(i == len) return true;
            }
            while (!isAlphanumeric(s.charAt(j))){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isAlphanumeric(char c){
        if('a'<= c && c<= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c<= '9'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

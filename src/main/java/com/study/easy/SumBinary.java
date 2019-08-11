package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: SumBinary
 * @Author: guanyushen
 * @Description: 题目:二进制求和
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * @Date: 2019/8/9 17:45
 */

public class SumBinary {

    public static String addBinary(String a, String b) {

        StringBuffer buffer = new StringBuffer();
        int temp = 0;
        for(int i=a.length()-1,j=b.length()-1;i>=0 || j>=0;i--,j--){
            int sum = temp;
            sum +=i>=0?a.charAt(i)-'0':0;
            sum +=j>=0?b.charAt(j)-'0':0;
            buffer.append(sum%2);
            temp = sum/2;
        }
        buffer.append(temp==1?temp:"");
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
}

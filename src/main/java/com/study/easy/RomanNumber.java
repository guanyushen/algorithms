package com.study.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目:罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * @author guanyushen
 * @date 2019/7/15 21:48
 */

public class RomanNumber {

    public static int romanToInt(String s) {

        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int sum = 0;
        for(int i = 0;i<s.length();){
            if(i+1 < s.length() && map.containsKey(s.substring(i, i+2))){
                sum += map.get(s.substring(i, i+2));
                i+=2;
            }else {
                sum += map.get(s.substring(i, i+1));
                i++;
            }
        }
        return sum;
    }

    /**
     * 更优解，运行效率更高
     * @param s
     * @return
     */
    public static int newRomanToInt(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int l=s.length()-1;
        int r=map.get(s.charAt(l));
        for(int i=l;i>0;i--){
            int a=map.get(s.charAt(i));
            int b=map.get(s.charAt(i-1));
            if(a<=b)
                r+=b;
            else{
                r-=b;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        String s= "LVIII";
        System.out.println(romanToInt(s));
    }

}

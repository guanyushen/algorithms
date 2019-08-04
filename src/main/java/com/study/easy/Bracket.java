package com.study.easy;

import java.util.Stack;

/**
 * 题目：判断是不是正确的括号
 * @author guanyushen
 * @date 2019/7/17 20:14
 */

public class Bracket {

    public static boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        for (int i=0; i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                    stack.push("(");
                    break;
                case ')':
                    if(stack.isEmpty()) return false;
                    if(!stack.pop().equals("(")) return false;
                    break;
                case '[':
                    stack.push("[");
                    break;
                case ']':
                    if(stack.isEmpty()) return false;
                    if(!stack.pop().equals("[")) return false;
                    break;
                case '{':
                    stack.push("{");
                    break;
                case '}':
                    if(stack.isEmpty()) return false;
                    if(!stack.pop().equals("{")) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println("输入:"+s);
        System.out.println("结果:"+isValid(s));
    }
}

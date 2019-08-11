package com.study.easy;

/**
 * @author guanyushen
 * @date 2019/8/11 20:48
 * 题目:回文链表
 * 请判断一个链表是否为回文链表。
 */

public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        //如果链表为空或者只有一个节点，直接返回true
        if (head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode iter = slow;
        ListNode pre = null;
        //反转后半部分链表
        while (iter != null) {
            ListNode temp = iter.next;
            iter.next = pre;
            pre = iter;
            iter = temp;
        }
        iter = head;
        ListNode tail = pre;
        //开始对比，看是否有不同的值
        boolean flag = true;
        while (tail != null) {
            if (iter.val != tail.val) {
                flag = false;
                break;
            }
            iter = iter.next;
            tail = tail.next;
        }
        //恢复链表原来的结构，本质上就是再反转一次
        iter = pre;
        pre = null;
        while (iter != null) {
            ListNode temp = iter.next;
            iter.next = pre;
            pre = iter;
            iter = temp;
        }
        return flag;
    }

    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        public void push(ListNode temp){
            if(temp != null){
                next = temp;
            }
        }
    }
}

package main.java.com.study.medium;

import main.java.com.study.easy.ReverseLink;

/**
 * @Package: main.java.com.study.medium
 * @ClassName: AddTwoNumber
 * @Author: guanyushen
 * @Description: 题目：两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @Date: 2019/8/21 20:01
 */

public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        int num = 0;
        while (l1 != null || l2 != null){
            int x = l1 != null ? l1.val:0;
            int y = l2 != null ? l2.val:0;
            int sum = x+y+num;
            num = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        if(num > 0){
            temp.next = new ListNode(num);
        }
        return newNode.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        public void push( ListNode temp){
            if(temp != null){
                next = temp;
            }
        }

    }
}

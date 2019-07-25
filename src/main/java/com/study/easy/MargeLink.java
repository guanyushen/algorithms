package com.study.easy;

import java.util.Arrays;

/**
 * 题目:合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author guanyushen
 * @date 2019/7/18 21:20
 */

public class MargeLink {

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

    public static void printLink(ListNode l1){
        System.out.println(l1.val);
        if (l1.next != null){
            printLink(l1.next);
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.push(l2);
        l2.push(l3);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.push(l5);
        l5.push(l6);
        ListNode  result=mergeTwoLists(l1, l4);
        printLink(result);
    }
}

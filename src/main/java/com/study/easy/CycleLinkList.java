package main.java.com.study.easy;

import com.study.easy.MargeLink;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: CycleLinkList
 * @Author: guanyushen
 * @Description: 题目:环形链表
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 * @Date: 2019/8/2 14:30
 */

public class CycleLinkList {

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
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

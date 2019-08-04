package main.java.com.study.medium;

import com.study.easy.MargeLink;

/**
 * @Package: main.java.com.study.medium
 * @ClassName: RemoveKByLink
 * @Author: guanyushen
 * @Description: 题目:删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * @Date: 2019/8/2 15:50
 */

public class RemoveKByLink {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtual = new ListNode(0);
        virtual.next = head;
        ListNode fast = virtual;
        ListNode slow = virtual;
        while (fast != null && n>0){
            fast = fast.next;
            n--;
        }
        if(fast == null) return head;
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return virtual.next;
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

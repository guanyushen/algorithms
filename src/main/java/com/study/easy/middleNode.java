package main.java.com.study.easy;


/**
 * @Package: main.java.com.study.easy
 * @ClassName: middleNode
 * @Author: guanyushen
 * @Description: 题目:链表的中间结点
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * @Date: 2019/8/2 16:15
 */

public class middleNode {

    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
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

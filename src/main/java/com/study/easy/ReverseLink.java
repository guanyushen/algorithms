package main.java.com.study.easy;


/**
 * @Package: main.java.com.study.easy
 * @ClassName: ReverseLink
 * @Author: guanyushen
 * @Description: 题目:反转链表
 * 反转一个单链表,返回反转后的首个节点
 * @Date: 2019/8/3 14:20
 */

public class ReverseLink {

    public ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode nowNode = head;
        while(nowNode != null){
            ListNode temp = nowNode.next;
            nowNode.next = left;
            left = nowNode;
            nowNode = temp;
        }
        return left;
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

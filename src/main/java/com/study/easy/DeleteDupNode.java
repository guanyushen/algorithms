package main.java.com.study.easy;

import com.study.easy.MargeLink;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: DeleteDupNode
 * @Author: guanyushen
 * @Description: 题目：删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @Date: 2019/8/22 16:40
 */

public class DeleteDupNode {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode top = head;
        while (head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else {
                head= head.next;
            }
        }
        return top;
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

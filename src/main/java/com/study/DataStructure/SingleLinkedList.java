package main.java.com.study.DataStructure;

/**
 * @Package: main.java.com.study.DataStructure
 * @ClassName: SingleLinkedList
 * @Author: guanyushen
 * @Description: 单链表练习
 * @Date: 2019/8/1 18:21
 */

public class SingleLinkedList {

    //单链表反转
    public static Node resverse(Node list){
        Node current = list;
        Node previous = null;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //检测单链表是否成环
    public static boolean isCircle(Node list){
        if(list == null) return false;
        Node fast = list.next;
        Node slow = list;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return  false;
    }

    //两个有序链表整合
    public static Node MargeTwoLink(Node l1,Node l2){
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.data < l2.data){
            l1.next = MargeTwoLink(l1.next , l2);
            return l1;
        }else{
            l2.next = MargeTwoLink(l1,l2.next);
            return l2;
        }
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }
}

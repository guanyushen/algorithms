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

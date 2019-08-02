package main.java.com.study.DataStructure;

/**
 * @Package: main.java.com.study.DataStructure
 * @ClassName: Stack
 * @Author: guanyushen
 * @Description: 基于链表实现的栈
 * @Date: 2019/8/2 17:16
 */

public class Stack {

    private Node top = null;

    public void push(int value){
        Node temp = new Node(value,null);
        if(top == null){
            top = temp;
        }else {
            temp.next = top;
            top = temp;
        }
    }

    public int pop(){
        if(top == null) return -1;
        int value = top.data;
        top = top.next;
        return value;
    }

    public void printAll(){
        Node p = top;
        while (p != null){
            System.out.print(p+" ");
            p = p.next;
        }
        System.out.println();
    }

    private static class Node {
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

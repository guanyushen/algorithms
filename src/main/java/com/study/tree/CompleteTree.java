package com.study.tree;

import com.study.base.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @desc: 判断是否为完全二叉树
 * @author: guanyushen
 * @date: 2024/6/26 10:29
 */
public class CompleteTree {

    public static boolean isCompleteTree(TreeNode treeNode) {
        if (treeNode == null || (treeNode.getLeft() == null && treeNode.getRight() == null)) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        boolean isLastLevel = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(isLastLevel && node != null) {
                return false;
            }
            if (node == null) {
                isLastLevel = true;
                continue;
            }
            queue.offer(node.getLeft());
            queue.offer(node.getRight());
        }
        return true;
    }

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(3));
        treeNode.getLeft().setRight(new TreeNode(4));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(isCompleteTree(treeNode));
    }
}

package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 是否为满二叉树
 * @author: guanyushen
 * @date: 2024/7/1 18:51
 */
public class FullTree {

    public static class Info {
        private int num;
        private int height;

        public Info(int num, int height) {
            this.num = num;
            this.height = height;
        }
    }

    public static boolean isFullBT(TreeNode root) {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            return true;
        }
        Info result = process(root);
        return result.num == 2 * result.height - 1;
    }

    public static Info process(TreeNode node) {
        if (node == null) return new Info(0, 0);
        Info leftInfo = process(node.getLeft());
        Info rightInfo = process(node.getRight());
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        int num = leftInfo.num + rightInfo.num + 1;
        return new Info(num, height);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(7));
//        treeNode.getLeft().setRight(new TreeNode(4));
//        treeNode.getLeft().getRight().setLeft(new TreeNode(3));
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(isFullBT(treeNode));
    }

}

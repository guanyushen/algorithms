package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc: 给定一个节点A和B，返回他们的最近公共祖先
 * @author: guanyushen
 * @date: 2024/7/5 15:24
 */
public class LeastCommonAncestors {

    public static class Info {
        private boolean isFindA;
        private boolean isFindB;
        private TreeNode ans;

        public Info(boolean isFindA, boolean isFindB, TreeNode ans) {
            this.isFindA = isFindA;
            this.isFindB = isFindB;
            this.ans = ans;
        }
    }

    public static TreeNode findCommonAncestors(TreeNode root, TreeNode a, TreeNode b) {
        return process(root, a, b).ans;
    }

    public static Info process(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) {
            return new Info(false, false, null);
        }
        Info leftInfo = process(root.getLeft(), a, b);
        Info rightInfo = process(root.getRight(), a, b);
        boolean isFindA = root == a || leftInfo.isFindA || rightInfo.isFindA;
        boolean isFindB = root == b || leftInfo.isFindB || rightInfo.isFindB;
        TreeNode ans = null;
        if (leftInfo.ans != null) {
            ans = leftInfo.ans;
        } else if (rightInfo.ans != null) {
            ans = rightInfo.ans;
        } else {
            if (isFindA && isFindB) {
                ans = root;
            }
        }
        return new Info(isFindA, isFindB, ans);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(7));
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(3);
        treeNode.getLeft().setRight(a);
        treeNode.getLeft().getRight().setLeft(b);
//        treeNode.getLeft().setLeft(new TreeNode(4));
        System.out.println(findCommonAncestors(treeNode, a, b));
    }

}

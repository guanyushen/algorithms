package main.java.com.study.easy;

import com.study.base.TreeNode;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: PathSum
 * @Author: guanyushen
 * @Description: 题目:路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，
 * 这条路径上所有节点值相加等于目标和。
 * @Date: 2019/8/1 10:48
 */

public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null) return false;
        sum -= root.getVal();
        if(root.getLeft()==null && root.getRight()==null){
            return sum==0;
        }else {
            return hasPathSum(root.getLeft(),sum) || hasPathSum(root.getRight(),sum);
        }
    }

    public static void main(String[] args) {

    }
}

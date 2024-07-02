package com.study.tree;

import com.study.base.TreeNode;

/**
 * @desc:
 * @author: guanyushen
 * @date: 2024/7/2 10:22
 */
public class GenerateTree {

    // for test
    public static TreeNode generateRandomBST(int maxLevel, int maxValue) {
        return generate(1, maxLevel, maxValue);
    }

    // for test
    public static TreeNode generate(int level, int maxLevel, int maxValue) {
        if (level > maxLevel || Math.random() < 0.5) {
            return null;
        }
        TreeNode head = new TreeNode((int) (Math.random() * maxValue));
        head.setLeft(generate(level + 1, maxLevel, maxValue));
        head.setRight(generate(level + 1, maxLevel, maxValue));
        return head;
    }

    public static void main(String[] args) {
        int maxLevel = 5;
        int maxValue = 100;
        int testTimes = 1000000;
        for (int i = 0; i < testTimes; i++) {
            TreeNode head = generateRandomBST(maxLevel, maxValue);
//            if (isCBT1(head) != isCBT2(head)) {
//                System.out.println("Oops!");
//            }
        }
        System.out.println("finish!");
    }
}

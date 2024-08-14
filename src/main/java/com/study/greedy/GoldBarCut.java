package com.study.greedy;

import java.util.PriorityQueue;

/**
 * @desc: 切金条问题
 * 一块金条切成两半，是需要花费和长度数值一样的铜板的。比如长度为20的金条，不管切成长度多大的两半，都要花费20个铜板。一群人想整分整块金条，怎么分最省铜板?
 * 例如,给定数组[10,20,30]，代表一共三个人，整块金条长度为10+20+30=60．金条要分成10,20,30三个部分。如果，先把长度60的金条分成10和50，
 * 花费60再把长度50的金条分成20和30，花费50一共花费110铜板。但是如果，先把长度60的金条分成30和30，花费60再把长度30金条分成10和20，花费30一共花费90铜板。
 * 所以后者为更优解！
 *
 * 思路
 * 思路：模拟哈夫曼编码，哈夫曼的思想就是这个题目的贪心策略（使用小根堆，每一次取出两个数去合成，加完之后放回去，排好序，重复上面的步骤）
 * 这个思维本质还是贪心算法，先取出最小的两个数，合并完后塞回数据组，然后再取出当前情况下的最小的两个数，再重复上面的所有动作，直到队列中只剩下一个数为止。
 * @author: guanyushen
 * @date: 2024/8/14 17:50
 */
public class GoldBarCut {

    public static int minCost(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int result = minCost(arr);
        System.out.println("最小花费: " + result);
    }

}

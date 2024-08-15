package com.study.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @desc: leetcode：502. 做项目能得到的最大利润
 * 输入:正数数组costs、正数数组profits、正数K、正数W。
 * costs[i]表示i号项目的花费，
 * profits[i]表示i号项目在扣除花费之后还能挣到的钱(利润)，
 * K表示你只能串行的最多做k个项目，
 * W表示你初始的资金。
 * 说明:每做完一个项目，马上获得的收益，可以支持你去做下一个项目。不能并行的做项目。
 * 输出:你最后获得的最大钱数。
 * <p>
 * 解法：
 * 1.将所有项目按照花费进行排序。
 * 2.使用一个最大堆来存储可以进行的项目的利润。
 * 3.每次选择当前资金能够进行的项目中利润最大的一个项目进行。
 * 4.更新资金后，继续选择下一个项目，直到完成K个项目或者没有可进行的项目为止。
 * @author: guanyushen
 * @date: 2024/8/15 19:08
 */
public class MaximizedCapital {

    public static int findMaximizedCapital(int k, int W, int[] profits, int[] costs) {
        int n = profits.length;
        // 创建一个最小堆，按项目花费排序
        PriorityQueue<int[]> minCostHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        // 创建一个最大堆，按项目利润排序
        PriorityQueue<int[]> maxProfitHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        // 将所有项目加入最小堆
        for (int i = 0; i < n; i++) {
            minCostHeap.offer(new int[]{costs[i], profits[i]});
        }

        // 进行最多k个项目
        for (int i = 0; i < k; i++) {
            // 将当前资金能够进行的项目加入最大堆
            while (!minCostHeap.isEmpty() && minCostHeap.peek()[0] <= W) {
                maxProfitHeap.offer(minCostHeap.poll());
            }
            // 如果最大堆为空，说明没有可以进行的项目，直接返回当前资金
            if (maxProfitHeap.isEmpty()) {
                return W;
            }
            // 选择利润最大的项目进行
            W += maxProfitHeap.poll()[1];
        }
        return W;
    }

    public static void main(String[] args) {
        int[] profits = {5,3,6};
        int[] costs = {1,5,7};
        System.out.println(findMaximizedCapital(2, 10, profits, costs));
    }
}

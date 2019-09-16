package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: BestTimeBuyStock
 * @Author: guanyushen
 * @Description: 题目：买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * @Date: 2019/9/16 16:35
 */

public class BestTimeBuyStock {

    public static int maxProfit(int[] prices) {

        int sin = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<sin){
                sin = prices[i];
            }else if(prices[i]-sin>maxprofit){
                maxprofit = prices[i]-sin;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

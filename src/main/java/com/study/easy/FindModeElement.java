package main.java.com.study.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: FindModeElement
 * @Author: guanyushen
 * @Description: 题目:求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * @Date: 2019/8/13 11:14
 */

public class FindModeElement {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        int sum = -1;
        Map.Entry<Integer,Integer> temp = null;
        for (Map.Entry<Integer,Integer> count:counts.entrySet()) {
            if(temp == null || count.getValue() > temp.getValue()){
                temp = count;
            }
        }
        return temp.getKey();
    }

    public static void main(String[] args) {

        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }
}

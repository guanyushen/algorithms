package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: Sqrt
 * @Author: guanyushen
 * @Description: 题目：x 的平方根
 * @Date: 2019/9/12 15:48
 */

public class Sqrt {

    public static int mySqrt(int x){
        if (x == 1 || x == 0) {
            return x;
        }
        int start = 1;
        int end = x / 2 + 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //防止越界
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {

        int x = 8;
        System.out.println(mySqrt(x));
    }
}

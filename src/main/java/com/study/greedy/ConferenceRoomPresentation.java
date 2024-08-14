package com.study.greedy;

import java.util.Arrays;

/**
 * @desc: 返回最多的会议室宣讲场次
 * 假设你只有1个会议室，一些项目要占用这个会议室进行宣讲，会议室不能同时容纳两个项目进行宣讲。
 * 给你每一个项目开始的时间和结束的时间，你来安排宣讲的日程，要求会议室进行的宣讲的场次最多，并返回最多的宣讲场次。
 * 一个项目宣讲完，下一个项目才可以宣讲，下一个项目的开始时间必须大于等于前一个项目的结束时间。
 * @author: guanyushen
 * @date: 2024/8/14 15:09
 */
public class ConferenceRoomPresentation {

    public static class Info implements Comparable<Info>{
        private int start;
        private int end;

        public Info(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Info o) {
            return Integer.compare(this.start,o.start);
        }
    }

    public static int process(Info[] infos) {
        return bestProcess(infos);
    }

    private static int bestProcess(Info[] infos) {
        Arrays.sort(infos);
        int timeLine = 0;
        int result = 0;
        for (int i=0;i< infos.length;i++) {
            if (timeLine <= infos[i].start) {
                timeLine = infos[i].end;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Info info1 = new Info(1,3);
        Info info2 = new Info(2,5);
        Info info3 = new Info(4,6);
        Info info4 = new Info(7,9);
        Info[] infos = new Info[]{info4,info1,info2,info3};
        System.out.println(process(infos));
    }

}

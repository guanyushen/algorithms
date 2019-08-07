package main.java.com.study.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: MorseUnique
 * @Author: guanyushen
 * @Description: 题目:唯一摩尔斯密码词
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。
 * 我们将这样一个连接过程称作单词翻译。返回我们可以获得所有词不同单词翻译的数量。
 * @Date: 2019/8/7 19:21
 */

public class MorseUnique {

    private static final String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>(words.length / 2);
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : word.toCharArray()) {
                stringBuilder.append(MORSE[(int) c - 97]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}

package main.java.com.study.easy;

/**
 * @Package: main.java.com.study.easy
 * @ClassName: DisableIpAddress
 * @Author: guanyushen
 * @Description: 题目:IP 地址无效化
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * @Date: 2019/8/5 10:07
 */

public class DisableIpAddress {

    public static String defangIPaddr(String address) {

        StringBuffer s = new StringBuffer();
        for (int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                s.append('[');
                s.append('.');
                s.append(']');
            }else {
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {

        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}

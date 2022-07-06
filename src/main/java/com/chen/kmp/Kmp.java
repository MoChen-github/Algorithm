package com.chen.kmp;

public class Kmp {

    /**
     * KMP算法
     * @param str1 源字符串
     * @param str2 子串
     * @param next 部分匹配表，时子串对应的部分匹配表
     * @return 如果-1 则没有匹配到，否侧返回第一个匹配的位置
     */
    public static int kmpSearch(String str1, String  str2, int[] next) {
        //遍历
        for (int i = 0, j = 0; i < str1.length(); i++) {
            //需要处理str1.charAt(i) != str2.charAt(j)的情况
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j-1];
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return  i-j+1;
            }
        }
        return -1;
    }
    public static int[] kmpNext(String dest) {
        //创建一个Next数组保存部分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0; //如果字符串长度为1 部分匹配值为0
        for (int i = 1, j = 0; i < dest.length(); i++) {
            //当第i个元素与前面从第j个字符不同时，向前寻找重新设定j的值，即
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j-1];
            }
            //求第i个元素的部分匹配值，用该元素去与字符串前面的元素比较
            //如果第i个元素与第1个元素相同，则部分匹配值加一，当完全遍历该字符串时，j+1，遍历该字符串的子串寻找子串的部分匹配值
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}

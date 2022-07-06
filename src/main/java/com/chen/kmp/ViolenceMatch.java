package com.chen.kmp;

public class ViolenceMatch {
    public static int violenceMatch(String  str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1Length = s1.length;
        int s2Length = s2.length;

        int i = 0;
        int j = 0;

        while (i < s1Length && j < s2Length) { //保证不越界
            if (s1[i] == s2[j]) { //匹配成功
                i++;
                j++;
            } else {
                i = i - (j - 1);
                j = 0;
            }
        }

        if (j == s2Length) {
            return i - j;
        } else {
            return -1;
        }
    }
}

package com.chen.kmp;

import org.junit.Test;

import java.util.Arrays;

import static com.chen.kmp.Kmp.kmpNext;
import static com.chen.kmp.Kmp.kmpSearch;

public class KmpTest {
    //测试求部分匹配值
    @Test
    public void testNext() {
        int[] next = kmpNext("ABCDABD");
        System.out.println("next=" + Arrays.toString(next));
    }

    @Test
    public void testKmp() {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        String str3 = "BBC";

        int[] next = kmpNext("ABCDABD");
        int index = kmpSearch(str1, str2, next);
        System.out.println("index=" + index);
    }
}

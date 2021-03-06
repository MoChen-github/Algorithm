package com.chen.kmp;

import org.junit.Test;

import static com.chen.kmp.ViolenceMatch.violenceMatch;

public class ViolenceMatchTest {
    @Test
    public void testViolenceMatch(){
        String str1 = " 稀疏数组、单向队列、环形队列、单向链表、双向链表、环形链表、约瑟夫问题、栈、前缀、中缀、后缀表达式、中缀表达式转换为后缀表达式、递归与回溯、迷宫问题、八皇后问题、算法的时间复杂度、冒泡排序、选择排序、插入排序、快速排序、归并排序、希尔排序、基数排序(桶排序)、堆排序、排序速度分析、二分查找、插值查找、斐波那契查找、散列、哈希表、二叉树、二叉树与数组转换、二叉排序树(BST)等。";
        String str2 = "队列";
        int index = violenceMatch(str1, str2);
        System.out.println("index = " + index);
    }
}

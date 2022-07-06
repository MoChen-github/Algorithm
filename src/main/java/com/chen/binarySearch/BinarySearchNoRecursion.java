package com.chen.binarySearch;

public class BinarySearchNoRecursion {
    /**
     * 二分查找的非递归方式
     * @param arr 待查找的数组，升序排列
     * @param target 需要查找的数
     * @return 返回对应下标，-1表示没找到
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right  =arr.length - 1;
        while (left <= right) { //继续查找
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1; //向左查找
            } else {
                left = mid + 1; //向右查找
            }
        }
        return -1;
    }
}

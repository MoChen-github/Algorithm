package com.chen.dynamicProgramming;

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] weight = {1, 4, 3}; //物品的重量
        int[] value = {1500, 3000, 2000}; //物品的价值
        int space = 4; //背包的空间大小
        int n = value.length; //物品的个数

        //创建一个二维数组，
        //v[i][j] 表示是在前i个物品中能够装入容量为j的背包中的最大价值
        int[][] v = new int[n+1][space+1];
        int[][] path = new int[n+1][space+1];

        //初始化第一行和第一列
        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0; //将第一列设置为0
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0; //将第一行设置为0
        }

        //根据公式开始动态规划处理
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                if (weight[i-1] > j) {
                    v[i][j] = v[i-1][j];
                } else {
                    //v[i][j] = Math.max(v[i-1][j], value[i-1] + v[i-1][j-weight[i-1]]);
                    //为了记录商品存放到背包中的情况，使用if-else处理并记录
                    if (v[i-1][j] < value[i-1] + v[i-1][j-weight[i-1]]) {
                        v[i][j] = value[i-1] + v[i-1][j-weight[i-1]];
                        path[i][j] = 1;
                    } else {
                        v[i][j] = v[i-1][j];
                    }
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + "  ");
            }
            System.out.println();
        }
        
        //输出放入的商品
        int i = path.length - 1;
        int j = path[0].length - 1;
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.printf("第%d个商品放入背包\n", i);
                j -= weight[i-1];
            }
            i--;
        }

    }
}

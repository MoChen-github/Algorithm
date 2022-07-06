package com.chen.divideAddConquer;

public class HanoiTower {

    //汉诺塔移动方法
    //分支方法
    public static void hanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("第1个盘" + a + "->" + c);
        } else {
            //如果有n >= 2 的情况， 我们总是可以将其看作是两个盘：1 最下边的一个盘子；2 上面的所有盘子
            //1 先把最下面的所有盘A -> B, 移动过程中会使用到 c
            hanoiTower(num - 1, a, c, b);
            //2 把最下面的盘子A -> C
            System.out.println("第" + num + "个盘" + a + "->" + c);
            //3 把B塔的所有盘子从B -> C， 移动过程使用到A塔
            hanoiTower(num-1, b, a, c);
        }
    }
}

package com.chen.divideAddConquer;

import org.junit.Test;

import static com.chen.divideAddConquer.HanoiTower.hanoiTower;

public class HanoiTowerTest {
    @Test
    public void testHanoiTower() {
        hanoiTower(3, 'A', 'B', 'C');
    }

}

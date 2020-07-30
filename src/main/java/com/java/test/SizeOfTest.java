package com.java.test;

import com.carrotsearch.sizeof.RamUsageEstimator;

/**
 * @author yangbin
 * @date 2020年07月29日
 */
public class SizeOfTest {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("RamUsageEstimator数据大小：" + RamUsageEstimator.sizeOf(obj));
    }
}

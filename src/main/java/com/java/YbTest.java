package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YangBin
 * @date 2020年04月02日
 */
public class YbTest {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10 * 1000);
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Thread.sleep(1);
            list.add(new String[i]);
        }
    }
}

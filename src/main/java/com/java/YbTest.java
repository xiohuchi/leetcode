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
        String[] array = new String[Integer.MAX_VALUE];
        List<String[]> list = new ArrayList<>();
        while (true) {
            System.out.println("添加数组");
            Thread.sleep(1000);
            list.add(array);
        }
    }
}

package com.java;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author YangBin
 * @date 2020年04月02日
 */
public class YbTest {

    public static void main(String[] args) {
        System.out.println(DateFormat.getTimeInstance(DateFormat.FULL).format(new Date()));
        System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date()));
        System.out.println(DateFormat.getTimeInstance(DateFormat.DATE_FIELD).format(new Date()));
        System.out.println(DateFormat.getTimeInstance(DateFormat.FULL).format(new Date()));
    }
}

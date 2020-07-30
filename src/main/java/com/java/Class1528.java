package com.java;

/**
 * @author yangbin
 * @date 2020年07月29日
 */
public class Class1528 {
    /**
     * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
     * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
     * 返回重新排列后的字符串。
     */
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] ss = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ss[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ss);
    }
}

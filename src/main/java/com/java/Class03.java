package com.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangbin
 * @date 2020年07月28日
 */
public class Class03 {


    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     */
    public static void main(String[] args) {
        String str = "abcca";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        int max = 0;
        Set<Character> set;
        for (int i = 0; i < s.length(); i++) {
            set = new HashSet<>();
            for (int i1 = i; i1 < s.length(); i1++) {
                Character split = s.charAt(i1);
                if (!set.contains(split)) {
                    set.add(split);
                } else {
                    max = Math.max(max, set.size());
                    break;
                }
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}

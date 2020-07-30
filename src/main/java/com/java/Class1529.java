package com.java;

/**
 * @author yangbin
 * @date 2020年07月29日
 */
public class Class1529 {

    /**
     * 1529. 灯泡开关 IV
     * 房间中有 n 个灯泡，编号从 0 到 n-1 ，自左向右排成一行。最开始的时候，所有的灯泡都是 关 着的。
     */
    public static void main(String[] args) {
        String target = "10111";
        System.out.println('0');
        System.out.println('1');
        System.out.println('0'==(0 + '0'));
        System.out.println(minFlips(target));
    }

    public static int minFlips(String target) {
        int ans = 0;
        int cur = 0;
        for (int i = 0; i < target.length(); i++) {
            //发现和cur不同，翻转cur
            if (target.charAt(i) != (cur + '0')) {
                ans++;
                cur = cur == 0 ? 1 : 0;
            }
        }
        return ans;
    }
}

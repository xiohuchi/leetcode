
package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author YangBin
 * @date 2020年03月23日
 * https://leetcode-cn.com/problems/minimum-falling-path-sum-ii/
 * 1289. 下降路径最小和  II
 * 给你一个整数方阵 arr ，定义「非零偏移下降路径」为：从 arr 数组中的每一行选择一个数字，且按顺序选出来的数字中，相邻数字不在原数组的同一列。
 * <p>
 * 请你返回非零偏移下降路径数字和的最小值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：13
 * 解释：
 * 所有非零偏移下降路径包括：
 * [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 * [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 * [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 * 下降路径中数字和最小的是 [1,5,7] ，所以答案是 13 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length == arr[i].length <= 200
 * -99 <= arr[i][j] <= 99
 * 通过次数1,335提交次数2,269
 */
public class Class1289 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(minFallingPathSum(arr));
    }

    public static int minFallingPathSum(int[][] arr) {
        TreeSet<Integer> sumSet = new TreeSet<Integer>();
        int num = arr.length;
        int size = arr[0].length;


        for (int i = 0; i < arr.length; i++) {
            int[] nums = new int[num];
            int sum = 0;
            for (int anInt : arr[i]) {
                sum += anInt;
            }
            sumSet.add(sum);
        }
        return sumSet.first();
    }

}

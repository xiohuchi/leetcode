package com.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author YangBin
 * @date 2020年03月23日
 * https://leetcode-cn.com/problems/remove-covered-intervals/
 * 1288. 删除被覆盖区间
 * 给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。
 * 只有当 c <= a 且 b <= d 时，我们才认为区间 [a,b) 被区间 [c,d) 覆盖。
 * 在完成所有删除操作后，请你返回列表中剩余区间的数目。
 * 示例：
 * 输入：intervals = [[1,4],[3,6],[2,8]]
 * 输出：2
 * 解释：区间 [3,6] 被区间 [2,8] 覆盖，所以它被删除了。
 * 提示：​​​​​​
 * 1 <= intervals.length <= 1000
 * 0 <= intervals[i][0] < intervals[i][1] <= 10^5
 * 对于所有的 i != j：intervals[i] != intervals[j]
 */
public class Class1288 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {3, 6}, {2, 8}};

        System.out.println(removeCoveredIntervals(intervals));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        int count = 0;
        lable:
        for (int i = 0; i < intervals.length; i++) {
            int[] a = intervals[i];
            for (int i1 = 0; i1 < intervals.length; i1++) {
                int[] b = intervals[i1];
                if (i != i1) {
                    if (a[0] >= b[0] && a[1] <= b[1]) {
                        continue lable;
                    }
                }
            }
            count++;
        }

        return count;
    }
}

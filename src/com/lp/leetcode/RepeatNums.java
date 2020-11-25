package com.lp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 *
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * 限制：
 *
 * 2 <= n <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RepeatNums {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println("************************findRepeatNumber(nums) : " + findRepeatNumber(nums));
    }

    /**
     * 遍历数组
     *
     * 复杂性分析
     *
     * 时间复杂度：O(n)O(n)。
     * 遍历数组一遍。使用哈希集合（HashSet），添加元素的时间复杂度为 O(1)O(1)，故总的时间复杂度是 O(n)O(n)。
     * 空间复杂度：O(n)O(n)。不重复的每个元素都可能存入集合，因此占用 O(n)O(n) 额外空间。
     */
    public static int findRepeatNumber(int[] nums) {
        // 利用map来就行存储
//        Map numsMap = new HashMap<Integer, Integer>();// 用set，因为不在乎顺序
        Set numsSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(numsSet.contains(nums[i])){
                return nums[i];
            }
            numsSet.add(nums[i]);
        }
        return new Integer(-1);
    }
}

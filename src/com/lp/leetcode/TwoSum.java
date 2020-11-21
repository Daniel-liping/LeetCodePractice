package com.lp.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和：
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = getTwoSumIndex(nums,target);
        System.out.println("******************getTwoSumIndex：" + Arrays.toString(result));
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("******************getTwoSumIndex：" + result[i]);
//        }
    }

    /**
     * 暴力枚举
     *  时间复杂度：O(N^2)O(N2)，其中 NN 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     *
     * 空间复杂度：O(1)O(1)。
     */
    public static int[] getTwoSumIndex(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if((target == nums[i] + nums[j]) && i!=j){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 哈希表
     * 时间复杂度：O(N)O(N)，其中 NN 是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
     *
     * 空间复杂度：O(N)O(N)，其中 NN 是数组中的元素数量。主要为哈希表的开销。
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    public static int[] getTwoSumIndex2(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return null;
        }
        // 数组中同一个元素不能使用两遍
        // 数组转换成 Map，边转换边查询
        // value要保持一致，所以这里采取下标为index
        // Map 中 key 为 数组的值
        // value 为 数组的下标
        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{(int)map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

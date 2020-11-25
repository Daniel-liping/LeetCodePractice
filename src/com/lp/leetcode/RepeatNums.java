package com.lp.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * �ҳ��������ظ������֡�
 *
 * ��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�
 *
 * ������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
 *
 * ʾ�� 1��
 * ���룺
 * [2, 3, 1, 0, 2, 5, 3]
 * �����2 �� 3
 * ���ƣ�
 *
 * 2 <= n <= 100000
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class RepeatNums {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println("************************findRepeatNumber(nums) : " + findRepeatNumber(nums));
    }

    /**
     * ��������
     *
     * �����Է���
     *
     * ʱ�临�Ӷȣ�O(n)O(n)��
     * ��������һ�顣ʹ�ù�ϣ���ϣ�HashSet�������Ԫ�ص�ʱ�临�Ӷ�Ϊ O(1)O(1)�����ܵ�ʱ�临�Ӷ��� O(n)O(n)��
     * �ռ临�Ӷȣ�O(n)O(n)�����ظ���ÿ��Ԫ�ض����ܴ��뼯�ϣ����ռ�� O(n)O(n) ����ռ䡣
     */
    public static int findRepeatNumber(int[] nums) {
        // ����map�����д洢
//        Map numsMap = new HashMap<Integer, Integer>();// ��set����Ϊ���ں�˳��
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

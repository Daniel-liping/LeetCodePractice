package com.lp.leetcode;

/**
 * ��ά�������
 * ��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 *
 * �����һ����Ч�ĺ���������������һ����ά�����һ���������ж��������Ƿ��и�������
 * ʾ��:
 *
 * ���о��� matrix ���£�
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * ���� target?=?5������?true��
 *
 * ����?target?=?20������?false��
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class TwoArrayLooked {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println("************************findRepeatNumber(nums) 1: " + findNumberIn2DArray(matrix, 5));
        System.out.println("************************findRepeatNumber(nums) 2: " + findNumberIn2DArray(matrix, 20));

        System.out.println("************************findNumberIn2DArray2(nums) 1: " + findNumberIn2DArray2(matrix, 5));
        System.out.println("************************findNumberIn2DArray2(nums) 2: " + findNumberIn2DArray2(matrix, 20));
    }

    /**
     * �����ⷨ
     *
     * ��������Ƕ�ά�����ź�����ص㣬��ֱ�ӱ���������ά�����ÿһ��Ԫ�أ��ж�Ŀ��ֵ�Ƿ��ڶ�ά�����д��ڡ�
     *
     * ���α�����ά�����ÿһ�к�ÿһ�С�����ҵ�һ��Ԫ�ص���Ŀ��ֵ���򷵻� true��������������δ�ҵ�����Ŀ��ֵ��Ԫ�أ��򷵻� false��
     *
     * ���ߣ�LeetCode-Solution
     * ���ӣ�https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/solution/mian-shi-ti-04-er-wei-shu-zu-zhong-de-cha-zhao-b-3/
     * ��Դ�����ۣ�LeetCode��
     * ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
     *
     * ʱ�临�Ӷȣ�O(nm)O(nm)����ά�����е�ÿ��Ԫ�ض������������ʱ�临�Ӷ�Ϊ��ά����Ĵ�С��
     * �ռ临�Ӷȣ�O(1)O(1)��
     */
    public static boolean findNumberIn2DArray ( int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int[] temp = matrix[i];
            for (int j = 0; j < temp.length; j++) {
                if(temp[j] == target){
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }

    /**
     * �����������Բ���
     * ���ڸ����Ķ�ά����߱�ÿ�д����ҵ����Լ�ÿ�д��ϵ��µ������ص㣬�����ʵ�һ��Ԫ��ʱ�������ų������еĲ���Ԫ�ء�
     *
     * �Ӷ�ά��������Ͻǿ�ʼ���ҡ�
     * �����ǰԪ�ص���Ŀ��ֵ���򷵻� true��
     * �����ǰԪ�ش���Ŀ��ֵ�����Ƶ����һ�С�
     * �����ǰԪ��С��Ŀ��ֵ�����Ƶ��±�һ�С�
     *
     * ����֤�����ַ���������Ŀ��ֵ�������ǰԪ�ش���Ŀ��ֵ��˵����ǰԪ�ص��±ߵ�����Ԫ�ض�һ������Ŀ��ֵ��������²��Ҳ������ҵ�Ŀ��ֵ��������ҿ����ҵ�Ŀ��ֵ��
     * �����ǰԪ��С��Ŀ��ֵ��˵����ǰԪ�ص���ߵ�����Ԫ�ض�һ��С��Ŀ��ֵ�����������Ҳ������ҵ�Ŀ��ֵ�����²��ҿ����ҵ�Ŀ��ֵ��
     *
     * ������Ϊ�գ����� false
     * ��ʼ�����±�Ϊ 0�����±�Ϊ��ά����������� 1
     * �ظ����в��裬ֱ�����±�����±곬���߽�
     * ��õ�ǰ�±�λ�õ�Ԫ�� num
     * ��� num �� target ��ȣ����� true
     * ��� num ���� target�����±�� 1
     * ��� num С�� target�����±�� 1
     * ѭ����ִ�������δ�ҵ�Ԫ�ص��� target ��˵��������������Ԫ�أ����� false
     *
     * ���ߣ�LeetCode-Solution
     * ���ӣ�https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/solution/mian-shi-ti-04-er-wei-shu-zu-zhong-de-cha-zhao-b-3/
     * ��Դ�����ۣ�LeetCode��
     * ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
     *
     * ���Ӷȷ���
     *
     * ʱ�临�Ӷȣ�O(n+m)O(n+m)�����ʵ����±����������� n �Σ��������� m �Σ����ѭ�������ִ�� n + m �Ρ�
     * �ռ临�Ӷȣ�O(1)O(1)��
     *
     * @param matrix
     * @param target
     * @return
     */
    public static boolean findNumberIn2DArray2 ( int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Boolean.valueOf(false);
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        // ��ʼ��
        int row = 0;
        int col = cols-1;
        while (row<rows && col>=0){
            int num = matrix[row][col];
            if(num == target){// �����ǰԪ�ص���Ŀ��ֵ���򷵻� true��
                return Boolean.valueOf(true);
            }else if(num > target){// �����ǰԪ�ش���Ŀ��ֵ�����Ƶ����һ�С�
                col --;
            }else{// �����ǰԪ��С��Ŀ��ֵ�����Ƶ��±�һ�С�
                row ++;
            }
        }
        return Boolean.valueOf(false);
    }
}

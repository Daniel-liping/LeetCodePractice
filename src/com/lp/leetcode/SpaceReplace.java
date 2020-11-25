package com.lp.leetcode;

import com.sun.deploy.util.StringUtils;

public class SpaceReplace {

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println("*********************replaceSpace��" + replaceSpace(s));
        System.out.println("*********************replaceSpace2��" + replaceSpace2(s));
    }

    // ����������ǲ���̫���ˡ�������
    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    /**
     * ����һ���ַ�����
     * ����ÿ���滻�� 1 ���ַ���� 3 ���ַ���ʹ���ַ�����ɷ���ؽ����滻��
     * �����ַ�����س���Ϊ s �ĳ��ȵ� 3 ���������ɱ�֤�ַ�����������������滻����ַ���
     *
     * ��� s �ĳ��� length
     * �����ַ����� array���䳤��Ϊ length * 3
     * ��ʼ�� size Ϊ 0��size ��ʾ�滻����ַ����ĳ���
     * �����ұ����ַ��� s
     * ��� s �ĵ�ǰ�ַ� c
     * ����ַ� c �ǿո����� array[size] = '%'��array[size + 1] = '2'��array[size + 2] = '0'������ size ��ֵ�� 3
     * ����ַ� c ���ǿո����� array[size] = c������ size ��ֵ�� 1
     * ��������֮��size ��ֵ�����滻����ַ����ĳ��ȣ��� array ��ǰ size ���ַ��������ַ��������������ַ���
     * Java
     *
     *
     * ���ߣ�LeetCode-Solution
     * ���ӣ�https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/mian-shi-ti-05-ti-huan-kong-ge-by-leetcode-solutio/
     * ��Դ�����ۣ�LeetCode��
     * ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
     * @param s
     * @return
     */
    public static String  replaceSpace2(String s) {
        if (s==null || s.length()==0){
            return "";
        }
        String newStr = "";
        char[] newChars = new char[s.length() * 3];
        char[] sChars = s.toCharArray();
        int size = 0;
        for (int i = 0; i < sChars.length; i++) {
            if(' ' == sChars[i]){
                newChars[size] = '%';
                newChars[size+1] = '2';
                newChars[size+2] = '0';
                size = size+3;
            }else{
                newChars[size] = sChars[i];
                size = size+1;
            }
        }
        newStr = String.valueOf(newChars, 0, size);
        return newStr;
    }
}

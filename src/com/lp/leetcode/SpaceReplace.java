package com.lp.leetcode;

import com.sun.deploy.util.StringUtils;

public class SpaceReplace {

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println("*********************replaceSpace：" + replaceSpace(s));
        System.out.println("*********************replaceSpace2：" + replaceSpace2(s));
    }

    // 这个方法，是不是太简单了。。。。
    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    /**
     * 方法一：字符数组
     * 由于每次替换从 1 个字符变成 3 个字符，使用字符数组可方便地进行替换。
     * 建立字符数组地长度为 s 的长度的 3 倍，这样可保证字符数组可以容纳所有替换后的字符。
     *
     * 获得 s 的长度 length
     * 创建字符数组 array，其长度为 length * 3
     * 初始化 size 为 0，size 表示替换后的字符串的长度
     * 从左到右遍历字符串 s
     * 获得 s 的当前字符 c
     * 如果字符 c 是空格，则令 array[size] = '%'，array[size + 1] = '2'，array[size + 2] = '0'，并将 size 的值加 3
     * 如果字符 c 不是空格，则令 array[size] = c，并将 size 的值加 1
     * 遍历结束之后，size 的值等于替换后的字符串的长度，从 array 的前 size 个字符创建新字符串，并返回新字符串
     * Java
     *
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/mian-shi-ti-05-ti-huan-kong-ge-by-leetcode-solutio/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
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

package com.lp.test;

/**
 *  5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 示例 1：
 *  输入: "babad"
 *  输出: "bab"
 *  注意: "aba" 也是一个有效答案。
 * 示例 2：
 *  输入: "cbbd"
 *  输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindrRome{

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
    private static String longestPalindrome(String s) {
        // 先判断是否为空字符串
        if("".equals(s) || s.length() == 0){
            return "";
        }
        String longStr = "";
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char chi = chars[i];
            for(int j=0; j<s.length(); j++){
                char chj = chars[j];
                if(chi == chj && i <= j){
                    System.out.println(s.substring(i, j+1));
                    String tmp = s.substring(i, j+1);
                    char[] tmpChars = tmp.toCharArray();
                    String tmpRome = "";
                    for(int a=tmpChars.length-1; a>=0; a--){
                        tmpRome = tmpRome + tmpChars[a];
                    }
                    if(tmp.equals(tmpRome)){
                        if(tmp.length() >= longStr.length()){
                            longStr = tmp;
                        }
                    }
                }
            }
        }
        return longStr;
    }


}

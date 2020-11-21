package com.lp.leetcode;

/**
 * 买卖股票的最佳时机
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意：你不能在买入股票前卖出股票。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：
 * 1、记录【今天之前买入的最小值】
 * 2、计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
 * 3、比较【每天的最大获利】，取最大值即可
 */
public class StocksBest{

    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("*************maxProfit：" + maxProfit(prices));
        System.out.println("*************maxProfit2：" + maxProfit2(prices));
        System.out.println("*************maxProfit3：" + maxProfit3(prices));
    }

    // 优势算法
    private static  int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int mp = 0;
        int min = prices[0];
        for (int i=0; i<prices.length; i++) {
            if(min>prices[i]){
                min = prices[i];
            }else if(mp<(prices[i] - min)){
                mp = prices[i] - min;
            }
        }
        return mp;
    }

    // 穷举法
    private static  int maxProfit2(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int mp = 0;
        for (int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++){
                if(mp<(prices[j]-prices[i])){
                    mp = prices[j]-prices[i];
                }
            }
        }
        return mp;
    }

    // 采用Math的max和min方法，方法跟 maxProfit 差不多
    private static  int maxProfit3(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i=0; i<prices.length; i++) {
            max = Math.max(max, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}

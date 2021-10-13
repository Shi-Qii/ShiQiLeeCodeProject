package LeetCodeTemple.Easy;

public class MaxProfit_121 {
    public static void main(String[] args) {
            int[]  intt= { 1,1,5,3,6,4};
        System.out.println( maxProfit(intt));;
    }

    public static int maxProfit(int [] prices) {
        int minprice = Integer.MAX_VALUE;  //最小值
        int maxprofit = 0;                  //最大值 // 利潤
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {   //當 最小的大於每天的值
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {  // 當利潤最高大於當前利潤
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

//    public static int maxProfit(int[] prices) {
//        int len = prices.length;
//        // 特殊判断
//        if (len < 2) {
//            return 0;
//        }
//        int[][] dp = new int[len][2];
//
//        // dp[i][0] 下标为 i 这天结束的时候，不持股，手上拥有的现金数
//        // dp[i][1] 下标为 i 这天结束的时候，持股，手上拥有的现金数
//
//        // 初始化：不持股显然为 0，持股就需要减去第 1 天（下标为 0）的股价
//        dp[0][0] = 0;
//        dp[0][1] = -prices[0];
//
//        // 从第 2 天开始遍历
//        for (int i = 1; i < len; i++) {
//
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            System.out.println(dp[i][0]);
//            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
//            System.out.println(dp[i][1]);
//        }
//        return dp[len - 1][0];
//    }

}

package dp;

import java.util.Arrays;

public class exe_121 {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int dp[] = new int[len];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i-1], prices[i] - min);
        }
        return dp[len-1];
    }

    public static void main(String[] args) {
        int stairs5 = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(stairs5);
    }
}
